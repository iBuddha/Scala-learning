//because frequenceies(c) = frequencies.getOrElse(c,0) + 1 is not a automic operation.
//so when when this operation is used by multiple thread, the result is not correct.
//when using ConcurrentHashMap this operation is still not automic.
//the correct usage must use a lock for the whole operation, like synchronized(lock){frequenceies(c) = frequencies.getOrElse(c,0) + 1 }
//or use ConcurrentHashMap<Char,AtomicLong> and AtomicLong#incrementAndGet()