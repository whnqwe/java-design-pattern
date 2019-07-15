#### JDK中的策略模式

JDK中的ThreadPoolExecutor使用了策略模式，它预定了4中策略：

- ThreadPoolExecutor.AbortPolicy()
- ThreadPoolExecutor.CallerRunsPolicy()
- ThreadPoolExecutor.DiscardOldestPolicy()
- ThreadPoolExecutor.DiscardPolicy()

每种策略都被单独定义了一个类，例如：

```
public static class AbortPolicy implements RejectedExecutionHandler
```

这符合对算法的单独封装，并能够相互替换。



