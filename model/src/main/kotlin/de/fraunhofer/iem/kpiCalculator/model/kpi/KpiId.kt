package de.fraunhofer.iem.kpiCalculator.model.kpi


enum class KpiId {
    // Raw Value KPIs
    CHECKED_IN_BINARIES,
    NUMBER_OF_COMMITS,
    VULNERABILITY_SCORE,
    NUMBER_OF_SIGNED_COMMITS,
    IS_DEFAULT_BRANCH_PROTECTED,
    SECRETS,
    SAST_USAGE,
    COMMENTS_IN_CODE,
    DOCUMENTATION_INFRASTRUCTURE,

    // Calculated KPIs
    SIGNED_COMMITS_RATIO,
    INTERNAL_QUALITY,
    EXTERNAL_QUALITY,
    PROCESS_COMPLIANCE,
    PROCESS_TRANSPARENCY,
    SECURITY,
    MAXIMAL_VULNERABILITY,
    DOCUMENTATION,

    // ROOT
    ROOT
}
