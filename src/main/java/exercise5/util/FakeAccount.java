package exercise5.util;

import com.github.javafaker.Faker;
import exercise5.accounts.CommonPerson;
import exercise5.accounts.LegalPerson;
import exercise5.models.Account;
import exercise5.models.Client;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FakeAccount {

    public static double formatNumber(double number) {
        DecimalFormat format = new DecimalFormat();
        format.setMaximumFractionDigits(2);
        double formatted = Double
                .parseDouble(format.format(number)
                        .replace(",", "."));
        return formatted;
    }

    public static double random(int round, double minValue) {
        Random random = new Random();
        double num = formatNumber(random.nextDouble() * round);
        if (num < minValue) {
            return num + minValue;
        }
        return num;
    }

    public static long randomLong() {
        return (long) (Math.random() * 20L);
    }

    public static List<Account> fakeList() {
        Faker faker = new Faker();
        Client client1 = new Client(1L, faker.name().fullName());
        Client client2 = new Client(2L, faker.name().fullName());
        Client client3 = new Client(3L, faker.name().fullName());
        Client client4 = new Client(4L, faker.name().fullName());
        Client client5 = new Client(5L, faker.name().fullName());
        Client client6 = new Client(6L, faker.name().fullName());
        Client client7 = new Client(7L, faker.name().fullName());
        Client client8 = new Client(8L, faker.name().fullName());
        Client client9 = new Client(9L, faker.name().fullName());
        Client client10 = new Client(10L, faker.name().fullName());


        //  Conta PF:
        CommonPerson commonPerson1 = new CommonPerson(1L, random(100, 10), client1);
        CommonPerson commonPerson2 = new CommonPerson(2L, random(100, 10), client2);
        CommonPerson commonPerson3 = new CommonPerson(3L, random(100, 10), client3);
        CommonPerson commonPerson4 = new CommonPerson(4L, random(100, 10), client4);
        CommonPerson commonPerson5 = new CommonPerson(5L, random(100, 10), client5);
        CommonPerson commonPerson6 = new CommonPerson(6L, random(100, 10), client1);
        CommonPerson commonPerson7 = new CommonPerson(7L, random(100, 10), client2);
        CommonPerson commonPerson8 = new CommonPerson(8L, random(100, 10), client3);
        CommonPerson commonPerson9 = new CommonPerson(9L, random(100, 10), client4);
        CommonPerson commonPerson10 = new CommonPerson(10L, random(100, 10), client5);

        //  Conta PJ:
        LegalPerson legalPerson1 = new LegalPerson(11L, random(100, 10), client10);
        LegalPerson legalPerson2 = new LegalPerson(12L, random(100, 10), client9);
        LegalPerson legalPerson3 = new LegalPerson(13L, random(100, 10), client8);
        LegalPerson legalPerson4 = new LegalPerson(14L, random(100, 10), client7);
        LegalPerson legalPerson5 = new LegalPerson(15L, random(100, 10), client6);
        LegalPerson legalPerson6 = new LegalPerson(16L, random(100, 10), client5);
        LegalPerson legalPerson7 = new LegalPerson(17L, random(100, 10), client4);
        LegalPerson legalPerson8 = new LegalPerson(18L, random(100, 10), client3);
        LegalPerson legalPerson9 = new LegalPerson(19L, random(100, 10), client2);
        LegalPerson legalPerson10 = new LegalPerson(20L, random(100, 10), client1);

        List<Account> accounts = Arrays.asList(
                commonPerson1, commonPerson2, commonPerson3,
                commonPerson4, commonPerson5, commonPerson6, commonPerson7, commonPerson8,
                commonPerson9, commonPerson10, legalPerson1, legalPerson2, legalPerson3,
                legalPerson4, legalPerson5, legalPerson6, legalPerson7, legalPerson8,
                legalPerson9, legalPerson10
        );
        return accounts;
    }
}
