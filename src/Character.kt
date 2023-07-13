class Character(var name: String) {

    init {
        this.name = name
    }

    override fun toString(): String {
        return "$name"
    }
}