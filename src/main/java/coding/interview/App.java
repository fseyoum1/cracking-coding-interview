package coding.interview;

import coding.interview.arrays.TextJustification;
import coding.interview.arrays.UniqueEmail;
import coding.interview.payment.service.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.random.RandomGenerator;

public class App {

    public static void main(String[] args) {
//        System.out.println("Hello from coding.interview.App");
//        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
//
//        UniqueEmail uniqueEmail = new UniqueEmail();
//        System.out.println("number of valid emails " + uniqueEmail.numUniqueEmails(emails));
//
//        int[] arr = {2,7,11,15};
//        int target = 9;
//        int[] result = uniqueEmail.twoSum(arr, 9);
//        System.out.println(Arrays.toString(result));

//        TextJustification textJustification = new TextJustification();
        /*


Output:
[
   "This    is    an",
   "example  of text",
   "justification.  "
]
         */
//        String[] words =  {"This", "is", "an", "example", "of", "text", "justification."};
//        int maxWidth = 16;
//        List<String> justResult = textJustification.fullJustify(words, 16);
//
//        for(String word : justResult)
//        {
//            System.out.println(word);
//        }

        PaymentTransactionService paymentTransactionService = new PaymentTransactionService();
        List<Transaction> transactionList = new ArrayList<>();
        Transaction transaction01 = new Transaction("1", "userId1", 100 );
        Transaction transaction02 = new Transaction("2", "userId2", 50 );
        Transaction transaction03 = new Transaction("3", "userId3", 70 );
        transactionList.add(transaction01);
        transactionList.add(transaction02);
        transactionList.add(transaction03);
        User userService1 = new User("userId1", "userone", "Active");
        User userService2 = new User("userId2", "usertwo", "Active");
        User userService3 = new User("userId3", "userthree", "notActive");
        List<EnrichedTransaction> enrichedTransactionList = paymentTransactionService.enrichTransactions(transactionList, userService1);

        System.out.println(enrichedTransactionList.toString());

    }
}
