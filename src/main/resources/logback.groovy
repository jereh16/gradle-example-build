// always a good idea to add an on console status listener
statusListener(OnConsoleStatusListener)

def USER_HOME = System.getProperty("user.home");
def WEBAPP_DIR = USER_HOME

addInfo("USER_HOME=${USER_HOME}, HOSTNAME=${hostname}")

appender("CONSOLE", ConsoleAppender) {
	encoder(PatternLayoutEncoder) { 
		pattern = "[%-5level] %-50logger{36} - %msg%n" 
	}
}


logger("de.rehpoehler", DEBUG)

logger("org.springframework", INFO)

logger("org.hiberate", INFO)
logger("org.hibernate.stat", DEBUG) // show hibernate statistics if enabled

root(WARN, ["CONSOLE"])
