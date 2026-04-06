package agsamkin.code;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GoodFirstIssueBotApplication {

    private static final Logger log = LoggerFactory.getLogger(GoodFirstIssueBotApplication.class);

    public static void main(String[] args) {
        try {
            log.info("Starting Good First Issue Bot application...");
            
            // Проверка токенов
            String tgToken = System.getenv("TG_BOT_TOKEN");
            String ghToken = System.getenv("GITHUB_TOKEN");
            if (tgToken == null || ghToken == null) {
                log.error("Missing TG_BOT_TOKEN or GITHUB_TOKEN in environment variables");
                return;
            }

            SpringApplication.run(GoodFirstIssueBotApplication.class, args);
            log.info("Bot started successfully");

        } catch (Exception e) {
            log.error("Failed to start bot application", e);
        }
    }
}
