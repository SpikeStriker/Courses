var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":203,"id":47651,"methods":[{"el":35,"sc":5,"sl":33},{"el":39,"sc":5,"sl":37},{"el":43,"sc":5,"sl":41},{"el":46,"sc":5,"sl":45},{"el":49,"sc":5,"sl":48},{"el":58,"sc":5,"sl":52},{"el":65,"sc":5,"sl":60},{"el":72,"sc":5,"sl":67},{"el":79,"sc":5,"sl":74},{"el":86,"sc":5,"sl":81},{"el":93,"sc":5,"sl":88},{"el":100,"sc":5,"sl":95},{"el":107,"sc":5,"sl":102},{"el":114,"sc":5,"sl":109},{"el":122,"sc":5,"sl":117},{"el":138,"sc":5,"sl":133},{"el":145,"sc":5,"sl":140},{"el":152,"sc":5,"sl":147},{"el":159,"sc":5,"sl":154},{"el":166,"sc":5,"sl":161},{"el":173,"sc":5,"sl":168},{"el":180,"sc":5,"sl":175},{"el":187,"sc":5,"sl":182},{"el":194,"sc":5,"sl":189},{"el":201,"sc":5,"sl":196}],"name":"TestStringConvert","sl":29}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_111":{"methods":[{"sl":196}],"name":"testSeconds","pass":true,"statements":[{"sl":197},{"sl":198},{"sl":199},{"sl":200}]},"test_1280":{"methods":[{"sl":147}],"name":"testMutablePeriod","pass":true,"statements":[{"sl":148},{"sl":149},{"sl":150},{"sl":151}]},"test_1341":{"methods":[{"sl":140}],"name":"testPeriod","pass":true,"statements":[{"sl":141},{"sl":142},{"sl":143},{"sl":144}]},"test_143":{"methods":[{"sl":168}],"name":"testWeeks","pass":true,"statements":[{"sl":169},{"sl":170},{"sl":171},{"sl":172}]},"test_1474":{"methods":[{"sl":74}],"name":"testLocalDateTime","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":77},{"sl":78}]},"test_1869":{"methods":[{"sl":133}],"name":"testDuration","pass":true,"statements":[{"sl":134},{"sl":135},{"sl":136},{"sl":137}]},"test_2059":{"methods":[{"sl":67}],"name":"testMutableDateTime","pass":true,"statements":[{"sl":68},{"sl":69},{"sl":70},{"sl":71}]},"test_2126":{"methods":[{"sl":154}],"name":"testYears","pass":true,"statements":[{"sl":155},{"sl":156},{"sl":157},{"sl":158}]},"test_2309":{"methods":[{"sl":81}],"name":"testLocalDate","pass":true,"statements":[{"sl":82},{"sl":83},{"sl":84},{"sl":85}]},"test_2341":{"methods":[{"sl":161}],"name":"testMonths","pass":true,"statements":[{"sl":162},{"sl":163},{"sl":164},{"sl":165}]},"test_2399":{"methods":[{"sl":52}],"name":"testDateMidnight","pass":true,"statements":[{"sl":54},{"sl":55},{"sl":56},{"sl":57}]},"test_2424":{"methods":[{"sl":117}],"name":"testTimeZone","pass":true,"statements":[{"sl":118},{"sl":119},{"sl":120},{"sl":121}]},"test_244":{"methods":[{"sl":182}],"name":"testHours","pass":true,"statements":[{"sl":183},{"sl":184},{"sl":185},{"sl":186}]},"test_2463":{"methods":[{"sl":95}],"name":"testYearMonth","pass":true,"statements":[{"sl":96},{"sl":97},{"sl":98},{"sl":99}]},"test_2500":{"methods":[{"sl":60}],"name":"testDateTime","pass":true,"statements":[{"sl":61},{"sl":62},{"sl":63},{"sl":64}]},"test_2882":{"methods":[{"sl":175}],"name":"testDays","pass":true,"statements":[{"sl":176},{"sl":177},{"sl":178},{"sl":179}]},"test_418":{"methods":[{"sl":102}],"name":"testMonthDay","pass":true,"statements":[{"sl":103},{"sl":104},{"sl":105},{"sl":106}]},"test_604":{"methods":[{"sl":109}],"name":"testMonthDay_leapDay","pass":true,"statements":[{"sl":110},{"sl":111},{"sl":112},{"sl":113}]},"test_607":{"methods":[{"sl":189}],"name":"testMinutes","pass":true,"statements":[{"sl":190},{"sl":191},{"sl":192},{"sl":193}]},"test_646":{"methods":[{"sl":88}],"name":"testLocalTime","pass":true,"statements":[{"sl":89},{"sl":90},{"sl":91},{"sl":92}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2399], [], [2399], [2399], [2399], [2399], [], [], [2500], [2500], [2500], [2500], [2500], [], [], [2059], [2059], [2059], [2059], [2059], [], [], [1474], [1474], [1474], [1474], [1474], [], [], [2309], [2309], [2309], [2309], [2309], [], [], [646], [646], [646], [646], [646], [], [], [2463], [2463], [2463], [2463], [2463], [], [], [418], [418], [418], [418], [418], [], [], [604], [604], [604], [604], [604], [], [], [], [2424], [2424], [2424], [2424], [2424], [], [], [], [], [], [], [], [], [], [], [], [1869], [1869], [1869], [1869], [1869], [], [], [1341], [1341], [1341], [1341], [1341], [], [], [1280], [1280], [1280], [1280], [1280], [], [], [2126], [2126], [2126], [2126], [2126], [], [], [2341], [2341], [2341], [2341], [2341], [], [], [143], [143], [143], [143], [143], [], [], [2882], [2882], [2882], [2882], [2882], [], [], [244], [244], [244], [244], [244], [], [], [607], [607], [607], [607], [607], [], [], [111], [111], [111], [111], [111], [], [], []]
