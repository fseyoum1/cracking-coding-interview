package coding.interview.payment.service;

public class EnrichedTransaction
{
    String transactionId;
    String userId;
    String userName;
    Integer amount;

    public EnrichedTransaction(String transactionId, String userId, String userName, Integer amount) {
        this.transactionId = transactionId;
        this.userId = userId;
        this.userName = userName;
        this.amount = amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
       return "{" +
               "\"transactionId\":\"" + transactionId + "\", " +
               "\"userId\":\"" + userId + "\", " +
               "\"userName\":\"" + userName +"\"," +
               "\"amount\":" + amount  +
               "}";
    }

}
