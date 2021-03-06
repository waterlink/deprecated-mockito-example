import org.junit.Test
import org.mockito.Mockito.*
import testutils.whenever

class AccountTest2 {

    private val statementReporter =
            mock(AccountStatementReporter::class.java)

    private val account = Account(statementReporter)

    @Test
    fun `prints the item when statement reporter can print`() {
        whenever(statementReporter.canPrintItem())
                .thenReturn(true)

        account.generateStatement()

        verify(statementReporter).printItem("-5,00\t73,91")
    }

    @Test
    fun `doesn’t print item when statement reporter can’t print`() {
        whenever(statementReporter.canPrintItem())
                .thenReturn(false)

        account.generateStatement()

        verify(statementReporter).canPrintItem()
        verifyNoMoreInteractions(statementReporter)
    }

}