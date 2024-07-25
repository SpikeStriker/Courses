var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":400,"id":49157,"methods":[{"el":38,"sc":5,"sl":36},{"el":42,"sc":5,"sl":40},{"el":46,"sc":5,"sl":44},{"el":49,"sc":5,"sl":48},{"el":52,"sc":5,"sl":51},{"el":62,"sc":5,"sl":55},{"el":74,"sc":5,"sl":65},{"el":87,"sc":5,"sl":77},{"el":100,"sc":5,"sl":89},{"el":112,"sc":5,"sl":102},{"el":129,"sc":5,"sl":114},{"el":150,"sc":5,"sl":131},{"el":156,"sc":5,"sl":153},{"el":161,"sc":5,"sl":158},{"el":166,"sc":5,"sl":163},{"el":175,"sc":5,"sl":169},{"el":183,"sc":5,"sl":177},{"el":192,"sc":5,"sl":186},{"el":210,"sc":5,"sl":195},{"el":224,"sc":5,"sl":213},{"el":237,"sc":5,"sl":226},{"el":250,"sc":5,"sl":239},{"el":263,"sc":5,"sl":252},{"el":272,"sc":5,"sl":265},{"el":289,"sc":5,"sl":275},{"el":308,"sc":5,"sl":291},{"el":324,"sc":5,"sl":310},{"el":343,"sc":5,"sl":326},{"el":359,"sc":5,"sl":345},{"el":377,"sc":5,"sl":361},{"el":390,"sc":5,"sl":379},{"el":398,"sc":5,"sl":393}],"name":"TestWeeks","sl":31}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1142":{"methods":[{"sl":131}],"name":"testFactory_parseWeeks_String","pass":true,"statements":[{"sl":132},{"sl":133},{"sl":134},{"sl":135},{"sl":136},{"sl":137},{"sl":138},{"sl":139},{"sl":144},{"sl":145}]},"test_1236":{"methods":[{"sl":326}],"name":"testMinus_Weeks","pass":true,"statements":[{"sl":327},{"sl":328},{"sl":329},{"sl":330},{"sl":331},{"sl":332},{"sl":334},{"sl":335},{"sl":337},{"sl":338}]},"test_1254":{"methods":[{"sl":169}],"name":"testIsGreaterThan","pass":true,"statements":[{"sl":170},{"sl":171},{"sl":172},{"sl":173},{"sl":174}]},"test_1492":{"methods":[{"sl":163}],"name":"testGetPeriodType","pass":true,"statements":[{"sl":164},{"sl":165}]},"test_1656":{"methods":[{"sl":213}],"name":"testToStandardDays","pass":true,"statements":[{"sl":214},{"sl":215},{"sl":216},{"sl":218},{"sl":219}]},"test_1729":{"methods":[{"sl":55}],"name":"testConstants","pass":true,"statements":[{"sl":56},{"sl":57},{"sl":58},{"sl":59},{"sl":60},{"sl":61}]},"test_1913":{"methods":[{"sl":195}],"name":"testSerialization","pass":true,"statements":[{"sl":196},{"sl":198},{"sl":199},{"sl":200},{"sl":201},{"sl":202},{"sl":204},{"sl":205},{"sl":206},{"sl":207},{"sl":209}]},"test_1929":{"methods":[{"sl":158}],"name":"testGetFieldType","pass":true,"statements":[{"sl":159},{"sl":160}]},"test_2161":{"methods":[{"sl":102}],"name":"testFactory_weeksIn_RInterval","pass":true,"statements":[{"sl":103},{"sl":104},{"sl":105},{"sl":107},{"sl":108},{"sl":109},{"sl":110},{"sl":111}]},"test_2179":{"methods":[{"sl":310}],"name":"testMinus_int","pass":true,"statements":[{"sl":311},{"sl":312},{"sl":313},{"sl":314},{"sl":316},{"sl":318},{"sl":319}]},"test_243":{"methods":[{"sl":393}],"name":"testAddToLocalDate","pass":true,"statements":[{"sl":394},{"sl":395},{"sl":396},{"sl":397}]},"test_2536":{"methods":[{"sl":114}],"name":"testFactory_standardWeeksIn_RPeriod","pass":true,"statements":[{"sl":115},{"sl":116},{"sl":117},{"sl":118},{"sl":119},{"sl":120},{"sl":121},{"sl":122},{"sl":123},{"sl":124}]},"test_2577":{"methods":[{"sl":89}],"name":"testFactory_weeksBetween_RPartial","pass":true,"statements":[{"sl":91},{"sl":92},{"sl":93},{"sl":95},{"sl":96},{"sl":97},{"sl":98},{"sl":99}]},"test_2590":{"methods":[{"sl":65}],"name":"testFactory_weeks_int","pass":true,"statements":[{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":70},{"sl":71},{"sl":72},{"sl":73}]},"test_26":{"methods":[{"sl":239}],"name":"testToStandardMinutes","pass":true,"statements":[{"sl":240},{"sl":241},{"sl":242},{"sl":244},{"sl":245}]},"test_2614":{"methods":[{"sl":186}],"name":"testToString","pass":true,"statements":[{"sl":187},{"sl":188},{"sl":190},{"sl":191}]},"test_2919":{"methods":[{"sl":379}],"name":"testNegated","pass":true,"statements":[{"sl":380},{"sl":381},{"sl":382},{"sl":384},{"sl":385}]},"test_2920":{"methods":[{"sl":252}],"name":"testToStandardSeconds","pass":true,"statements":[{"sl":253},{"sl":254},{"sl":255},{"sl":257},{"sl":258}]},"test_2956":{"methods":[{"sl":265}],"name":"testToStandardDuration","pass":true,"statements":[{"sl":266},{"sl":267},{"sl":268},{"sl":270},{"sl":271}]},"test_548":{"methods":[{"sl":275}],"name":"testPlus_int","pass":true,"statements":[{"sl":276},{"sl":277},{"sl":278},{"sl":279},{"sl":281},{"sl":283},{"sl":284}]},"test_566":{"methods":[{"sl":153}],"name":"testGetMethods","pass":true,"statements":[{"sl":154},{"sl":155}]},"test_740":{"methods":[{"sl":361}],"name":"testDividedBy_int","pass":true,"statements":[{"sl":362},{"sl":363},{"sl":364},{"sl":365},{"sl":366},{"sl":367},{"sl":368},{"sl":369},{"sl":371},{"sl":372}]},"test_746":{"methods":[{"sl":77}],"name":"testFactory_weeksBetween_RInstant","pass":true,"statements":[{"sl":78},{"sl":79},{"sl":80},{"sl":82},{"sl":83},{"sl":84},{"sl":85},{"sl":86}]},"test_85":{"methods":[{"sl":291}],"name":"testPlus_Weeks","pass":true,"statements":[{"sl":292},{"sl":293},{"sl":294},{"sl":295},{"sl":296},{"sl":297},{"sl":299},{"sl":300},{"sl":302},{"sl":303}]},"test_919":{"methods":[{"sl":345}],"name":"testMultipliedBy_int","pass":true,"statements":[{"sl":346},{"sl":347},{"sl":348},{"sl":349},{"sl":350},{"sl":352},{"sl":353},{"sl":354}]},"test_943":{"methods":[{"sl":226}],"name":"testToStandardHours","pass":true,"statements":[{"sl":227},{"sl":228},{"sl":229},{"sl":231},{"sl":232}]},"test_998":{"methods":[{"sl":177}],"name":"testIsLessThan","pass":true,"statements":[{"sl":178},{"sl":179},{"sl":180},{"sl":181},{"sl":182}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1729], [1729], [1729], [1729], [1729], [1729], [1729], [], [], [], [2590], [2590], [2590], [2590], [2590], [2590], [2590], [2590], [2590], [], [], [], [746], [746], [746], [746], [], [746], [746], [746], [746], [746], [], [], [2577], [], [2577], [2577], [2577], [], [2577], [2577], [2577], [2577], [2577], [], [], [2161], [2161], [2161], [2161], [], [2161], [2161], [2161], [2161], [2161], [], [], [2536], [2536], [2536], [2536], [2536], [2536], [2536], [2536], [2536], [2536], [2536], [], [], [], [], [], [], [1142], [1142], [1142], [1142], [1142], [1142], [1142], [1142], [1142], [], [], [], [], [1142], [1142], [], [], [], [], [], [], [], [566], [566], [566], [], [], [1929], [1929], [1929], [], [], [1492], [1492], [1492], [], [], [], [1254], [1254], [1254], [1254], [1254], [1254], [], [], [998], [998], [998], [998], [998], [998], [], [], [], [2614], [2614], [2614], [], [2614], [2614], [], [], [], [1913], [1913], [], [1913], [1913], [1913], [1913], [1913], [], [1913], [1913], [1913], [1913], [], [1913], [], [], [], [1656], [1656], [1656], [1656], [], [1656], [1656], [], [], [], [], [], [], [943], [943], [943], [943], [], [943], [943], [], [], [], [], [], [], [26], [26], [26], [26], [], [26], [26], [], [], [], [], [], [], [2920], [2920], [2920], [2920], [], [2920], [2920], [], [], [], [], [], [], [2956], [2956], [2956], [2956], [], [2956], [2956], [], [], [], [548], [548], [548], [548], [548], [], [548], [], [548], [548], [], [], [], [], [], [], [85], [85], [85], [85], [85], [85], [85], [], [85], [85], [], [85], [85], [], [], [], [], [], [], [2179], [2179], [2179], [2179], [2179], [], [2179], [], [2179], [2179], [], [], [], [], [], [], [1236], [1236], [1236], [1236], [1236], [1236], [1236], [], [1236], [1236], [], [1236], [1236], [], [], [], [], [], [], [919], [919], [919], [919], [919], [919], [], [919], [919], [919], [], [], [], [], [], [], [740], [740], [740], [740], [740], [740], [740], [740], [740], [], [740], [740], [], [], [], [], [], [], [2919], [2919], [2919], [2919], [], [2919], [2919], [], [], [], [], [], [], [], [243], [243], [243], [243], [243], [], [], []]
