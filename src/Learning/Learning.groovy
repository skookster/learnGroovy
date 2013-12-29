package Learning

/**
 * Created by Eric on 12/11/13.
 *
 * Base class for learning Groovy
 *
 */
def name = "Chris"
def printClosure = { println "Hello, ${name}" }
printClosure()
name = "Joseph"
printClosure()
