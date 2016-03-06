// always a good idea to add an on console status listener
statusListener(OnConsoleStatusListener)

def USER_HOME = System.getProperty("user.home");
def WEBAPP_DIR = USER_HOME

addWarn("USER_HOME=" + USER_HOME + ", HOSTNAME=" + hostname)

appender("CONSOLE", ConsoleAppender) {
	encoder(PatternLayoutEncoder) { 
		pattern = "[%-5level] %-50logger{36} - %msg%n" 
	}
}

logger("ch.qos.logback.classic.gaffer", WARN)
logger("de.projekt", DEBUG)

logger("org.springframework", INFO)

logger("org.hiberate", INFO)
logger("org.hibernate.stat", DEBUG) // show hibernate statistics if enabled

logger("org.thymeleaf", info)

root(WARN, ["CONSOLE"])
