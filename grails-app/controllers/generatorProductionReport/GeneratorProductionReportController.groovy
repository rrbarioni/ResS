package generatorProductionReport

import residueGenerator.ResidueGenerator

/**
 * Created by ess on 16/11/15.
 */
class GeneratorProductionReportController {

    def createMonthlyReport(int months){
        return new GeneratorProductionReport()
    }
}
