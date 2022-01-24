import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;
import java.util.*;

public class Mailer {

    public void Mailer() throws Exception {
        String usrname;
        String pwd;
        Scanner in = new Scanner(System.in);
        System.out.println("\nEnter the gmail user name :");
        usrname = in.next();
        System.out.println("\nEnter the Password :");
        pwd = in.next();
        String HOST_NAME = "smtp.gmail.com";
        int HOST_PORT = 465;

        Properties props = new Properties();
        props.put("mail.transport.protocol", "smtps");
        props.put("mail.smtps.host", HOST_NAME);
        props.put("mail.smtps.auth", "true");

        Session mailSession = Session.getDefaultInstance(props);
        Transport transport = mailSession.getTransport();

        String toadd;
        System.out.println("\nEnter the Recipient Address:");
        toadd = in.next();
        MimeMessage message = new MimeMessage(mailSession);

        System.out.println("\nEnter the Subject:");

        String sub = in.nextLine();
        message.setSubject(sub);

        System.out.println("\nEnter the message body:");
        String body = in.nextLine();
        message.setContent(body, "text/plain");
        message.addRecipient(Message.RecipientType.TO, new InternetAddress(toadd));
        transport.connect(HOST_NAME, HOST_PORT, usrname, pwd);
        transport.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
        transport.close();

        System.out.println("Mail Sent successfully!!!!");
        System.exit(0);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("*******************Welcome to Mailer*************************");

        Mailer mail = new Mailer();
        mail.Mailer();
    }
}