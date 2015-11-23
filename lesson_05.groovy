import groovy.transform.TypeChecked

@TypeChecked
class Duck {
    def name
    def birthday
    def isDuck
    def age
    def weight
    def child

    def quack() {
        "name - $name, birthday - $birthday, isDuck - $isDuck, age - $age, weight - $weight, child - $child"
    }
}

def duck1 = new Duck(name: "Gus1", birthday: new Date(), isDuck: true, age: 1, weight: 2.5, child: ['one', 'two'])
println duck1.quack()

def duck2 = new Duck(name: new Date(), birthday: '11.12.1978', isDuck: '', age: 'year1', weight: 2.5, child: [1, 2])
println duck2.quack()

def duck3 = new Duck(name: "Gus3", birthday: new Date(), isDuck: true, age: 'year3', weight: 2.5, child: [1, 2])
println duck3.quack()

@TypeChecked
class DuckHart {
    String name
    Date birthday
    Boolean isDuck
    Integer age
    BigDecimal weight
    List<Integer> child


    String quack() {
        "name - $name, birthday - $birthday, isDuck - $isDuck, age - $age, weight - $weight, child - $child"
    }
}

DuckHart duck4 = new DuckHart(name: "Gus4", birthday: new Date(), isDuck: true, age: 1, weight: 2.5, child: ['one', 'two'])
println duck4.quack()

//DuckHart duck5 = new DuckHart(name: new Date(), birthday: '11.12.2011', isDuck: '', age: 'year1', weight: 2.5, child: [1, 2])
//println duck5.quack()

DuckHart duck6 = new DuckHart(name: "Gus6", birthday: new Date(), isDuck: true, age: 2, weight: 2.5, child: [1, 2])
println duck6.quack()