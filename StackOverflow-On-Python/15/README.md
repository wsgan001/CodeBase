| rank | ▲ | ✰ | vote | url |
|:-:|:-:|:-:|:-:|:-:|
|  15  |  789 | 144 | 1269 | [url](http://stackoverflow.com/questions/53513/best-way-to-check-if-a-list-is-empty) |

***

## 检查列表是否为空的最好方法

例如,传递下面:

```
a = []
```

我怎么检查`a`是空值?

***

```python
if not a:
  print "List is empty"
```

用隐藏的空列表的布尔值才是最Pythonic的方法.
