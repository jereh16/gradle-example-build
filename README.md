# Example gradle build scripts

## Features

- `version+configuration.gradle`: custom version and configuration depending on build
- `eclipse.gradle`: eclipse + eclipse WTP configuration example
- `less.gradle`: lessc configuration
- `tomcat.gradle`: start/stop a tomcat server, usefull for integration testing
- `release-tasks.gradle`: some default tasks, usefull when releasing software (including publishing to a maven repository)

## Usage:

- copy the following files and directories into your project root: 
  `build.gradle`, `version.properties`, `settings.gradle`, `config` and `gradle`
- change project name in file `settings.gradle`
- customize general build configuration by changing `config/gradle/default.config`
- if necessary create a personal build configuration by creating a `config/gradle/<username>.config` file
- add additional plug-in configuration files to `config` directory, e.g. `config/checkstyle/checkstyle.xml`
