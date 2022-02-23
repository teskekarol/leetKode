package easy

import spock.lang.Specification

class PrintInOrderRunnerTest extends Specification {

    def "should return in order"() {
        given:
        def buffer = new ByteArrayOutputStream()
        System.out = new PrintStream(buffer)

        and:
        def runner = new PrintInOrderRunner()

        when:
        runner.run(new Order(1, 2, 3))

        then:
        buffer.toString() == "231firstsecondthird"
    }
}
