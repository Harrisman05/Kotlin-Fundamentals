fun main() {

    /*
        - public: Default modifier, can be accessed everywhere
        - internal: Available everywhere in the same module. A module can be imported
                    and are the set of files which are compiled at the same time during build process
        - private: Available only inside the containing file/class
        - protected: Same as private but available inside subclasses
                     or child classes
     */

    var vis_mod = VisibilityModifierClass()

    println("Public property: ${vis_mod.availableProperty}")
    println("Internal property: ${vis_mod.internalProperty}")

}