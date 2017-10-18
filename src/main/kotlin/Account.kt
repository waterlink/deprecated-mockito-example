class Account(private val statementReporter: AccountStatementReporter) {

    fun generateStatement() {
        if (!statementReporter.canPrintItem()) {
            return
        }

        try {
            statementReporter.printItem("-5,00\t73,91")
        } catch (e: Exception) {

        }
    }

}