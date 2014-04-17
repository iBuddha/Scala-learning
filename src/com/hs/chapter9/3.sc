import scala.collection.{immutable, BitSet}

/**
 * Created by hs on 14-4-17.
 */
//abstract class BitSet extends scala.collection.AbstractSet[Int]
//with SortedSet[Int]
//with scala.collection.BitSet
//with BitSetLike[BitSet]
//with Serializable

/**
  BitSet >> lin(AbstractSet) >> line(SortedSet) >> line(scala.collection.BitSet) >> BitSet
  BitSet >> Serializable >> lin(BitSetLike) >> lin(scala.collection.BitSet) >> lin(SortedSet) >> lin(scala.collection.AbstractSet)
  BitSet >> Serializable >> lin(BitSetLike >> SortedSetLike >> SetLike >> Sorted) >> lin(scala.collection.BitSet >> BitSetLike >> SortedSet>>SortedSetLike >> Set) >> lin(SortedSet >> SortedSetLike >> Set )
          >> lin(AbstractSet)
  BitSet >> Serializable >> BitSet >> BitSetLike >> SortedSet >> SortedSetLike >> AbstractSet >> Set >> SetLike >> Sorted