package kadotchi.sample;

import com.amazonaws.services.quicksight.AmazonQuickSight;
import com.amazonaws.services.quicksight.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuickSightService {

    private final AmazonQuickSight client;
    private final AwsConfig awsConfig;

    @Autowired
    public QuickSightService(AmazonQuickSight client, AwsConfig awsConfig) {
        this.client = client;
        this.awsConfig = awsConfig;
    }

    public List<String> getListUsers() {
        List<String> users = new ArrayList<String>();
        ListUsersResult result = client.listUsers(new ListUsersRequest()
                .withAwsAccountId(awsConfig.getAccountId())
                .withNamespace("default"));

        result.getUserList().forEach(user -> {
            System.out.println(user.getUserName());
            users.add(user.getArn());
        });

        return users;
    }

    public String getListDataSets() {
        ListDataSetsRequest dataSetsRequest = new ListDataSetsRequest().withAwsAccountId(awsConfig.getAccountId());
        ListDataSetsResult res = client.listDataSets(dataSetsRequest);
        return res.toString();
    }

    public boolean registAutherUser() {
        String userName = "auther-user-01";

        try {

            RegisterUserRequest req = new RegisterUserRequest()
                    .withIdentityType(IdentityType.QUICKSIGHT)
                    .withEmail("")
                    .withUserRole(UserRole.READER)
                    .withAwsAccountId(awsConfig.getAccountId())
                    .withNamespace("default")
                    .withUserName(userName);

            RegisterUserResult res = client.registerUser(req);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

}
