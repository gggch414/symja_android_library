## DiscreteUniformDistribution

```
DiscreteUniformDistribution({min, max})
```

> returns a discrete uniform distribution.

See:  
* [Wikipedia - Discrete uniform distribution](https://en.wikipedia.org/wiki/Discrete_uniform_distribution)

### Examples

The variance of the discrete uniform distribution is

```
>> Variance(DiscreteUniformDistribution({l, r}))
1/12*(-1+(1-l+r)^2)
```

### Related terms 
[CDF](CDF.md), [Mean](Mean.md), [Median](Mean.md), [PDF](PDF.md), [Quantile](Quantile.md), [StandardDeviation](StandardDeviation.md), [Variance](Variance.md) 