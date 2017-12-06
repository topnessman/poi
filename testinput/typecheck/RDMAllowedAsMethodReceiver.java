import qual.Mutable;
import qual.ReceiverDependantMutable;
import qual.Immutable;

// :: error: (constructor.return.incompatible) :: error: (type.invalid)
@Immutable class RDMAllowedAsMethodReceiver {
    // @ReceiverDependantMutable declared receiver is allowed. Otherwise, clone() has warnings
    // in every overriding class.
    void foo(@ReceiverDependantMutable RDMAllowedAsMethodReceiver this) {}
}

@Mutable
class AnotherExample {
    void foo(@ReceiverDependantMutable AnotherExample this) {}
}
