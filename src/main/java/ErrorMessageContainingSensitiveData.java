package javacodechecker;

public class ErrorMessageContainingSensitiveData {

    public void method1(){

        try
        {
            throw new UnsupportedOperationException();
        }
        // EMB-ISSUE: CodeIssueNames.ERROR_MESSAGE_CONTAINING_SENSITIVE_DATA
        catch (SQLException e)
        {
            e.printStackTrace();
        }


        try
        {
            throw new UnsupportedOperationException();
        }
        // EMB-ISSUE: CodeIssueNames.ERROR_MESSAGE_CONTAINING_SENSITIVE_DATA
        catch (SQLException e)
        {
            IO.writeLine(e);
        }

        try
        {
            throw new UnsupportedOperationException();
        }
        // EMB-ISSUE: CodeIssueNames.ERROR_MESSAGE_CONTAINING_SENSITIVE_DATA
        catch (SQLException e)
        {
            System.out.print(e);
        }

        try
        {
            throw new UnsupportedOperationException();
        }
        // EMB-ISSUE: CodeIssueNames.ERROR_MESSAGE_CONTAINING_SENSITIVE_DATA
        catch (SQLException e)
        {
            System.out.println(e);
        }

        try
        {
            throw new UnsupportedOperationException();
        }
        // EMB-ISSUE: CodeIssueNames.ERROR_MESSAGE_CONTAINING_SENSITIVE_DATA/no-detect
        catch (SQLException e)
        {
            IO.writeLine("There was an unsupported operation error");
        }

        try
        {
            throw new UnsupportedOperationException();
        }
        // EMB-ISSUE: CodeIssueNames.ERROR_MESSAGE_CONTAINING_SENSITIVE_DATA/no-detect
        catch (SQLException e)
        {
            IO.writeLine("There was an unsupported operation error");
        }
    }
}