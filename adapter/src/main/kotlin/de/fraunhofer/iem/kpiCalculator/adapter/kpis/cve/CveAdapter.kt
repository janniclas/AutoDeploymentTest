package de.fraunhofer.iem.kpiCalculator.adapter.kpis.cve

import de.fraunhofer.iem.kpiCalculator.adapter.AdapterResult
import de.fraunhofer.iem.kpiCalculator.adapter.ErrorType
import de.fraunhofer.iem.kpiCalculator.adapter.KpiAdapter
import de.fraunhofer.iem.kpiCalculator.model.adapter.vulnerability.VulnerabilityDto
import de.fraunhofer.iem.kpiCalculator.model.kpi.KpiId
import de.fraunhofer.iem.kpiCalculator.model.kpi.RawValueKpi

object CveAdapter : KpiAdapter<VulnerabilityDto> {

    override fun transformDataToKpi(data: Collection<VulnerabilityDto>): Collection<AdapterResult> {
        return data
            .map {
                return@map if (isValid(it)) {
                    AdapterResult.Success(
                        RawValueKpi(
                            kind = KpiId.VULNERABILITY_SCORE,
                            score = (it.severity * 10).toInt()
                        )
                    )
                } else {
                    AdapterResult.Error(ErrorType.DATA_VALIDATION_ERROR)
                }
            }
    }

    private fun isValid(data: VulnerabilityDto): Boolean {
        return (
            data.severity in 0.0..10.0 &&
                data.packageName.isNotBlank() &&
                data.cveIdentifier.isNotBlank()
            )
    }
}
