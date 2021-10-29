public class ExceptionFailedSearch extends RuntimeException{
    public ExceptionFailedSearch(String errorMessage, Throwable err)
    {
        super(errorMessage,err);
    }
}
