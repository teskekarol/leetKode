package easy

import spock.lang.Specification

class MinimumIndexSumofTwoListsTest extends Specification {

    def sut = new MinimumIndexSumofTwoLists()

    def "should solve case 1"() {
        given:
        def first = ["Shogun","Tapioca Express","Burger King","KFC"] as String[]
        def second = ["Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"] as String[]

        when:
        def result = sut.findRestaurant(first, second)

        then:
        result == ["Shogun"] as String[]

    }

    def "should solve case 2"() {
        given:
        def first = ["Shogun","KFC","Burger King",] as String[]
        def second = ["KFC","Shogun","Burger King"] as String[]

        when:
        def result = sut.findRestaurant(first, second)

        then:
        result as Set == ["Shogun", "KFC"] as Set

    }

    def "should solve case 3"() {
        given:
        def first = ["Shogun","Tapioca Express","Burger King","KFC"] as String[]
        def second = ["KFC","Burger King","Tapioca Express","Shogun"] as String[]

        when:
        def result = sut.findRestaurant(first, second)

        then:
        result as Set == ["KFC","Burger King","Tapioca Express","Shogun"] as Set

    }
}
