package coding.interview.payment.service;

public class User implements UserService
{
    String userId;

    String userName;

    String status;

    public User(String userId, String userName, String status) {
        this.userId = userId;
        this.userName = userName;
        this.status = status;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public User getUserById(String userId)
    {
        if (userId.equals("userId1"))
        {
            return new User("userId1", "userone", "Active");
        }
        else if (userId.equals("userId2"))
        {
            return new User("userId2", "usertwo", "Active");
        }
        else if (userId.equals("userId3"))
        {
            return new User("userId3", "userthree", "notActive");
        }
        return null;
    }

    @Override
    public String toString() {
        return "UserService{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
