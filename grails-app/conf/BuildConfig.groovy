grails.servlet.version = "2.5" // Change depending on target container compliance (2.5 or 3.0)
grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
grails.project.target.level = 1.6
grails.project.source.level = 1.6
grails.server.port.http = 8070
//grails.project.war.file = "target/${appName}-${appVersion}.war"





grails.project.dependency.resolution = {
    // inherit Grails' default dependencies
    inherits("global") {
        // specify dependency exclusions here; for example, uncomment this to disable ehcache:
        // excludes 'ehcache'
    }
    log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    checksums true // Whether to verify checksums on resolve
    //legacyResolve true // whether to do a secondary resolve on plugin installation, not advised but here for backwards compatibility

    repositories {
        inherits true // Whether to inherit repository definitions from plugins

        grailsPlugins()
        grailsHome()
        grailsCentral()

        mavenLocal()
        mavenCentral()

        // uncomment these (or add new ones) to enable remote dependency resolution from public Maven repositories
        //mavenRepo "http://snapshots.repository.codehaus.org"
        //mavenRepo "http://repository.codehaus.org"
        mavenRepo "http://download.java.net/maven/2/"
        mavenRepo "http://repository.jboss.com/maven2/"
        mavenRepo "https://repo.grails.org/grails/plugins"
        mavenRepo "http://dl.bintray.com/alkemist/maven/"
    }
    dependencies {
        compile "org.spockframework:spock-grails-support:0.7-groovy-1.8"
        //test "org.spockframework:spock-grails-support:0.7-groovy-2.0"
        test "org.gebish:geb-junit4:0.9.2"
        test "org.seleniumhq.selenium:selenium-support:2.39.0"
        test "org.seleniumhq.selenium:selenium-firefox-driver:2.39.0"
        test "org.seleniumhq.selenium:selenium-chrome-driver:2.39.0"
    }

    plugins {
        compile ":remote-control:1.4"
        compile ":jquery-ui:1.10.4"
        runtime ":hibernate:$grailsVersion"
        runtime ":jquery:1.8.3"
        runtime ":resources:1.1.6"

        // Uncomment these (or add new ones) to enable additional resources capabilities
        //runtime ":zipped-resources:1.0"
        //runtime ":cached-resources:1.0"
        //runtime ":yui-minify-resources:0.1.5"

        build ":tomcat:$grailsVersion"

        runtime ":database-migration:1.3.2"

        compile ':cache:1.0.1'

        test(":cucumber:0.10.0") {
            exclude "spock-core"
        }

        test ":geb:0.9.2"
    }
}
