# Good First Issue Bot 🤖

[![build and test](https://github.com/agsamkin/goodfirstissue-bot/actions/workflows/build.yml/badge.svg)](https://github.com/agsamkin/goodfirstissue-bot/actions/workflows/build.yml)

The bot allows you to easily pick up your first good issues from popular open-source projects, and helps you make your first contributions as an open-source developer.

---

## 🚀 Features
- Telegram bot to find good first issues on GitHub
- Select your preferred programming language
- List repositories and issues
- Sort and filter issues and repositories
- Easy to configure and run

---

## 💻 Installation

### Clone repository
```bash
git clone https://github.com/YOUR_USERNAME/goodfirstissue-bot.git
cd goodfirstissue-bot

Java setup
Make sure you have Java 17+ and Maven installed
Set environment variables

Create config.properties file:

TG_BOT_USERNAME=your_bot_username
TG_BOT_TOKEN=your_telegram_token
GITHUB_TOKEN=your_github_token
📦 Run Bot
Using Maven
mvn clean install
mvn exec:java -Dexec.mainClass="com.example.BotMain"
Using Docker
docker build -t goodfirstissue-bot .
docker run -d --env-file .env goodfirstissue-bot
🧪 Tests
mvn test
🔧 Webhook setup (optional)
Install ngrok
 (Windows) or localtunnel
 (Linux)
Start tunnel:
ngrok http 8080
Set webhook:
https://api.telegram.org/bot{my_bot_token}/setWebhook?url={url_to_send_updates_to}
🐰 RabbitMQ setup (optional)
docker pull rabbitmq:3.11.0-management
docker volume create rabbitmq_data
docker run -d --hostname rabbitmq --name rabbitmq -p 5672:5672 -p 15672:15672 -v rabbitmq_data:/var/lib/rabbitmq --restart=unless-stopped rabbitmq:3.11.0-management
📖 Contributing
Fork repo
Create new branch: git checkout -b improve-bot
Make your changes
Push branch and create Pull Request
🖼 How to use
/setmylang — select preferred language
/repos — list repositories
/issues — list issues
/settings — change order and direction of sorting
