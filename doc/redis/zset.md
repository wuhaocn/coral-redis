## zset信令

```
*6
$4
zadd
$8
testzset
$1
2
$3
two
$1
3
$5
three
:2
*6
$4
zadd
$8
testzset
$1
4
$4
two1
$1
5
$6
three1
:2
*4
$6
zrange
$8
testzset
$1
0
$1
0
*1
$3
two
*4
$6
zrange
$8
testzset
$1
0
$1
1
*2
$3
two
$5
three
*4
$6
zrange
$8
testzset
$1
0
$1
2
*3
$3
two
$5
three
$4
two1
*4
$6
zrange
$8
testzset
$1
0
$1
3
*4
$3
two
$5
three
$4
two1
$6
three1
*4
$6
zrange
$8
testzset
$1
0
$2
-1
*4
$3
two
$5
three
$4
two1
$6
three1
*4
$6
zrange
$8
testzset
$1
0
$2
-4
*1
$3
two
*4
$6
zrange
$8
testzset
$1
0
$2
-5
*0

```