//
//Every valid email consists of a local name and a domain name, separated by the '@' sign. 
//Besides lowercase letters, the email may contain one or more '.' or '+'.
//For example, in "alice@leetcode.com", "alice" is the local name, and "leetcode.com" is the domain name.
//If you add periods '.' between some characters in the local name part of an email address,
//mail sent there will be forwarded to the same address without dots in the local name. Note that this rule does not apply to domain names.
//
//For example, "alice.z@leetcode.com" and "alicez@leetcode.com" forward to the same email address.
//If you add a plus '+' in the local name, everything after the first plus sign will be ignored.
//This allows certain emails to be filtered. Note that this rule does not apply to domain names.
//
//For example, "m.y+name@email.com" will be forwarded to "my@email.com".
//It is possible to use both of these rules at the same time.
//
//Given an array of strings emails where we send one email to each email[i], 
//return the number of different addresses that actually receive mails.
package uniqueemailaddresses;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {

    public static int numUniqueEmails(String[] emails) {

        for (int i = 0; i < emails.length; i++) {

            if (emails[i].contains("@")) {
                int index = emails[i].indexOf("@");
                if (emails[i].contains(".")) {
                    String s = emails[i].substring(0, index);
                    emails[i] = s.replace(".", "") + emails[i].substring(index, emails[i].length());
                }
                if (emails[i].contains("+")) {
                    int index3 = emails[i].indexOf("@");
                    int index2 = emails[i].indexOf("+");
                    String str = emails[i].substring(index2, index3);
                    emails[i] = emails[i].replace(str, "");
                }

            }
        }
        int c = 0;
        for (int i = 0; i < emails.length; i++) {
            for (int j = 0; j < emails.length; j++) {
                if (emails[i].equals(emails[j]) && i != j) {
                    c++;
                    System.out.println(emails[i]);
                }
            }
        }

        return emails.length - (c / 2);

    }

    public static void main(String[] args) {
        String[] emails = {"a@leetcode.com", "b@leetcode.com", "c@leetcode.com"};
        System.out.println(numUniqueEmails(emails));
    }

}
