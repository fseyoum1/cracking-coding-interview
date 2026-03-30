package coding.interview.payment.service;

import java.util.Arrays;
import java.util.List;

public class Transaction
{

    String id;
    String userId;

    Integer amount;

    public Transaction(String id, String userId, Integer amount) {
        this.id = id;
        this.userId = userId;
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction{" + "id='" + id + '\'' + ", userId='" + userId + '\'' + ", amount=" + amount + '}';
    }

    //    List<Transaction> getTransactions()
//    {
//        { "id": "t1", "userId": "u1", "amount": 100 },
//        { "id": "t2", "userId": "u2", "amount": 200 },
//        { "id": "t3", "userId": "u1", "amount": 50 })
//    }
}
