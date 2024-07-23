var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":292,"id":59184,"methods":[{"el":45,"sc":5,"sl":43},{"el":49,"sc":5,"sl":47},{"el":53,"sc":5,"sl":51},{"el":58,"sc":5,"sl":55},{"el":62,"sc":5,"sl":60},{"el":82,"sc":5,"sl":65},{"el":86,"sc":5,"sl":84},{"el":91,"sc":5,"sl":89},{"el":95,"sc":5,"sl":93},{"el":99,"sc":5,"sl":97},{"el":103,"sc":5,"sl":101},{"el":107,"sc":5,"sl":105},{"el":111,"sc":5,"sl":109},{"el":123,"sc":5,"sl":114},{"el":130,"sc":5,"sl":125},{"el":141,"sc":5,"sl":132},{"el":148,"sc":5,"sl":143},{"el":156,"sc":5,"sl":151},{"el":166,"sc":5,"sl":158},{"el":173,"sc":5,"sl":168},{"el":183,"sc":5,"sl":175},{"el":194,"sc":5,"sl":186},{"el":208,"sc":5,"sl":196},{"el":220,"sc":5,"sl":211},{"el":231,"sc":5,"sl":222},{"el":245,"sc":5,"sl":234},{"el":256,"sc":5,"sl":247},{"el":272,"sc":5,"sl":259},{"el":290,"sc":5,"sl":275}],"name":"TestScaledDurationField","sl":35}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1005":{"methods":[{"sl":93}],"name":"test_getName","pass":true,"statements":[{"sl":94}]},"test_1078":{"methods":[{"sl":89}],"name":"test_getType","pass":true,"statements":[{"sl":90}]},"test_1379":{"methods":[{"sl":211}],"name":"test_getDifference_long_int","pass":true,"statements":[{"sl":212},{"sl":213},{"sl":214},{"sl":215},{"sl":216},{"sl":217}]},"test_1556":{"methods":[{"sl":105}],"name":"test_getUnitMillis","pass":true,"statements":[{"sl":106}]},"test_1569":{"methods":[{"sl":143}],"name":"test_getValueAsLong_long_long","pass":true,"statements":[{"sl":144},{"sl":145},{"sl":146},{"sl":147}]},"test_1571":{"methods":[{"sl":234}],"name":"test_equals","pass":true,"statements":[{"sl":235},{"sl":236},{"sl":237},{"sl":238},{"sl":239},{"sl":240},{"sl":241},{"sl":242},{"sl":243},{"sl":244}]},"test_1584":{"methods":[{"sl":196}],"name":"test_add_long_long","pass":true,"statements":[{"sl":197},{"sl":198},{"sl":199},{"sl":200},{"sl":201},{"sl":204},{"sl":205}]},"test_1732":{"methods":[{"sl":186}],"name":"test_add_long_int","pass":true,"statements":[{"sl":187},{"sl":188},{"sl":189},{"sl":190},{"sl":191}]},"test_1907":{"methods":[{"sl":259}],"name":"test_compareTo","pass":true,"statements":[{"sl":260},{"sl":261},{"sl":262},{"sl":263},{"sl":268},{"sl":269}]},"test_1943":{"methods":[{"sl":84}],"name":"test_getScalar","pass":true,"statements":[{"sl":85}]},"test_2395":{"methods":[{"sl":222}],"name":"test_getDifferenceAsLong_long_long","pass":true,"statements":[{"sl":223},{"sl":224},{"sl":225},{"sl":226},{"sl":227},{"sl":228}]},"test_2456":{"methods":[{"sl":275}],"name":"testSerialization","pass":true,"statements":[{"sl":276},{"sl":278},{"sl":279},{"sl":280},{"sl":281},{"sl":282},{"sl":284},{"sl":285},{"sl":286},{"sl":287},{"sl":289}]},"test_2502":{"methods":[{"sl":114}],"name":"test_getValue_long","pass":true,"statements":[{"sl":115},{"sl":116},{"sl":117},{"sl":118},{"sl":119},{"sl":120}]},"test_2595":{"methods":[{"sl":101}],"name":"test_isPrecise","pass":true,"statements":[{"sl":102}]},"test_2730":{"methods":[{"sl":151}],"name":"test_getMillis_int","pass":true,"statements":[{"sl":152},{"sl":153},{"sl":154},{"sl":155}]},"test_2970":{"methods":[{"sl":175}],"name":"test_getMillis_long_long","pass":true,"statements":[{"sl":176},{"sl":177},{"sl":178},{"sl":179},{"sl":180}]},"test_3222":{"methods":[{"sl":132}],"name":"test_getValue_long_long","pass":true,"statements":[{"sl":133},{"sl":134},{"sl":135},{"sl":136},{"sl":137},{"sl":138}]},"test_3370":{"methods":[{"sl":65}],"name":"test_constructor","pass":true,"statements":[{"sl":66},{"sl":67},{"sl":70},{"sl":71},{"sl":74},{"sl":75},{"sl":78},{"sl":79}]},"test_3413":{"methods":[{"sl":158}],"name":"test_getMillis_long","pass":true,"statements":[{"sl":159},{"sl":160},{"sl":161},{"sl":162},{"sl":163}]},"test_3636":{"methods":[{"sl":125}],"name":"test_getValueAsLong_long","pass":true,"statements":[{"sl":126},{"sl":127},{"sl":128},{"sl":129}]},"test_3863":{"methods":[{"sl":168}],"name":"test_getMillis_int_long","pass":true,"statements":[{"sl":169},{"sl":170},{"sl":171},{"sl":172}]},"test_3930":{"methods":[{"sl":109}],"name":"test_toString","pass":true,"statements":[{"sl":110}]},"test_4012":{"methods":[{"sl":247}],"name":"test_hashCode","pass":true,"statements":[{"sl":248},{"sl":249},{"sl":250},{"sl":251},{"sl":252},{"sl":253},{"sl":254},{"sl":255}]},"test_883":{"methods":[{"sl":97}],"name":"test_isSupported","pass":true,"statements":[{"sl":98}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3370], [3370], [3370], [], [], [3370], [3370], [], [], [3370], [3370], [], [], [3370], [3370], [], [], [], [], [1943], [1943], [], [], [], [1078], [1078], [], [], [1005], [1005], [], [], [883], [883], [], [], [2595], [2595], [], [], [1556], [1556], [], [], [3930], [3930], [], [], [], [2502], [2502], [2502], [2502], [2502], [2502], [2502], [], [], [], [], [3636], [3636], [3636], [3636], [3636], [], [], [3222], [3222], [3222], [3222], [3222], [3222], [3222], [], [], [], [], [1569], [1569], [1569], [1569], [1569], [], [], [], [2730], [2730], [2730], [2730], [2730], [], [], [3413], [3413], [3413], [3413], [3413], [3413], [], [], [], [], [3863], [3863], [3863], [3863], [3863], [], [], [2970], [2970], [2970], [2970], [2970], [2970], [], [], [], [], [], [1732], [1732], [1732], [1732], [1732], [1732], [], [], [], [], [1584], [1584], [1584], [1584], [1584], [1584], [], [], [1584], [1584], [], [], [], [], [], [1379], [1379], [1379], [1379], [1379], [1379], [1379], [], [], [], [], [2395], [2395], [2395], [2395], [2395], [2395], [2395], [], [], [], [], [], [1571], [1571], [1571], [1571], [1571], [1571], [1571], [1571], [1571], [1571], [1571], [], [], [4012], [4012], [4012], [4012], [4012], [4012], [4012], [4012], [4012], [], [], [], [1907], [1907], [1907], [1907], [1907], [], [], [], [], [1907], [1907], [], [], [], [], [], [2456], [2456], [], [2456], [2456], [2456], [2456], [2456], [], [2456], [2456], [2456], [2456], [], [2456], [], [], []]
