package kadotchi.sample;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.quicksight.AmazonQuickSight;
import com.amazonaws.services.quicksight.AmazonQuickSightClientBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@ConfigurationProperties(prefix = "aws")
@Component
public class AwsConfig {

    private String accountId;
    private String accessKey;
    private String secretKey;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    @Bean
    private AmazonQuickSight getClient() {
        final AWSCredentialsProvider credsProvider = new AWSCredentialsProvider() {
            @Override
            public AWSCredentials getCredentials() {
                // provide actual IAM access key and secret key here
                return new BasicAWSCredentials(accessKey, secretKey);
            }

            @Override
            public void refresh() {
            }
        };

        return AmazonQuickSightClientBuilder
                .standard()
                .withRegion(Regions.AP_NORTHEAST_1.getName())
                .withCredentials(credsProvider)
                .build();
    }


}
