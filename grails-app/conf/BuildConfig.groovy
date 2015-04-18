grails.servlet.version = "2.5" // Change depending on target container compliance (2.5 or 3.0)
grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
grails.project.target.level = 1.6
grails.project.source.level = 1.6
//grails.project.war.file = "target/${appName}-${appVersion}.war"

grails.project.dependency.resolution = {
    // inherit Grails' default dependencies
    inherits("global") {
        // specify dependency exclusions here; for example, uncomment this to disable ehcache:
        // excludes 'ehcache'
    }
    log "error" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    checksums true // Whether to verify checksums on resolve

    repositories {
        inherits true // Whether to inherit repository definitions from plugins

        grailsPlugins()
        grailsHome()
        grailsCentral()

        mavenRepo "http://repo.grails.org/grails/plugin"
        //mavenLocal()
        mavenCentral()

    }
    dependencies {

        compile ('commons-codec:commons-codec:1.6')

    }

    plugins {
        runtime ":hibernate:2.1.0"
        runtime ":jquery:1.7.2"
        runtime ":resources:1.1.6"
        test ":cucumber:0.4.0"
        build ":tomcat:2.1.0"
        runtime ":database-migration:1.1"
        compile ':cache:1.0.0'
    }
}
