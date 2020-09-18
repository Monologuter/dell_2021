### String，StringBuilder，StringBuffer的区别
                String类型和 StringBuffer 类型的主要性能区别其实在于 
                String 是不可变的对象, 因此在每次对 String 类型进行改变的时候其实都等同于生成了一个新的 String 对象，
                然后将指针指向新的 String 对象。如果经常改变字符串内容，最好不要用 String ，因为每次生成对象都会对系统
                性能产生影响，而且当内存中无引用的对象多了以后， JVM 的 垃圾回收器GC 就会开始工作，程序运行速度就会变慢
                。如果是定义一个StringBuffer 类型的对象，每次对字符串内容进行操作都会对 StringBuffer对象本身进行操作
                ，而不是生成新的对象。所以一般情况下推荐使用 StringBuffer ，特别是字符串对象经常改变的情况下。
                StringBuffer中很多方法可以带有synchronized关键字，所以可以保证线程是安全的，但StringBuilder
                的方法则没有该关键字，所以不能保证线程安全。StringBuilder类提供一个与 StringBuffer 兼容的 API，
                该类被设计用作 StringBuffer 的一个简易替换，用在字符串缓冲区被单个线程使用的时候。如果可能，
                建议优先采用该类，因为在大多数实现中，它比 StringBuffer 要快。两者的方法基本相同。
            