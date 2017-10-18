interface AccountStatementReporter {

    fun canPrintItem(): Boolean
    fun printItem(item: String)

}