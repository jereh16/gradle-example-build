# Example gradle build scripts

## Single and multi projects

- see `multi-project` for an example with multiple sub-projects
- see `single-project` for an example with a simple project

## Features

- `version+configuration.gradle`: custom version and configuration depending on build
- `eclipse.gradle`: eclipse + eclipse WTP configuration example
- `release-tasks.gradle`: some default tasks, usefull when releasing software (including publishing to a maven repository)
- `less.gradle`: lessc configuration
- `tomcat.gradle`: start/stop a tomcat server, usefull for integration testing
- `integration-test.gradle`: sourceset and tasks for running integration tests (e.g. by using selenium)
- `aspectj.gradle`: aspectj integration, including eclipse project generation
- `checks.gradle`: checkstyle, jdepend, pmd and findbugs
- `flyway.gradle`: database migrations with flyway
- `jacococ.gradle`: jacoco code coverage

## Usage:

- copy the following files and directories into your project root: 
  `build.gradle`, `version.properties`, `settings.gradle`, `config` and `gradle`
- change project name in file `settings.gradle`
- customize general build configuration by changing `config/gradle/default.config`
- if necessary create a personal build configuration by creating a `config/gradle/<username>.config` file
- add additional plug-in configuration files to `config` directory, e.g. `config/checkstyle/checkstyle.xml`
- customize version numbers of dependencies in `build.gradle
