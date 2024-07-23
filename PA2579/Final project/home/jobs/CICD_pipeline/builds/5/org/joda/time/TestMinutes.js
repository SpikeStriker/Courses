var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":380,"id":37607,"methods":[{"el":38,"sc":5,"sl":36},{"el":42,"sc":5,"sl":40},{"el":46,"sc":5,"sl":44},{"el":49,"sc":5,"sl":48},{"el":52,"sc":5,"sl":51},{"el":62,"sc":5,"sl":55},{"el":74,"sc":5,"sl":65},{"el":87,"sc":5,"sl":77},{"el":100,"sc":5,"sl":89},{"el":112,"sc":5,"sl":102},{"el":130,"sc":5,"sl":114},{"el":151,"sc":5,"sl":132},{"el":157,"sc":5,"sl":154},{"el":162,"sc":5,"sl":159},{"el":167,"sc":5,"sl":164},{"el":176,"sc":5,"sl":170},{"el":184,"sc":5,"sl":178},{"el":193,"sc":5,"sl":187},{"el":211,"sc":5,"sl":196},{"el":218,"sc":5,"sl":214},{"el":224,"sc":5,"sl":220},{"el":230,"sc":5,"sl":226},{"el":243,"sc":5,"sl":232},{"el":252,"sc":5,"sl":245},{"el":269,"sc":5,"sl":255},{"el":288,"sc":5,"sl":271},{"el":304,"sc":5,"sl":290},{"el":323,"sc":5,"sl":306},{"el":339,"sc":5,"sl":325},{"el":357,"sc":5,"sl":341},{"el":370,"sc":5,"sl":359},{"el":378,"sc":5,"sl":373}],"name":"TestMinutes","sl":31}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1055":{"methods":[{"sl":220}],"name":"testToStandardDays","pass":true,"statements":[{"sl":221},{"sl":222},{"sl":223}]},"test_1076":{"methods":[{"sl":255}],"name":"testPlus_int","pass":true,"statements":[{"sl":256},{"sl":257},{"sl":258},{"sl":259},{"sl":261},{"sl":263},{"sl":264}]},"test_1205":{"methods":[{"sl":341}],"name":"testDividedBy_int","pass":true,"statements":[{"sl":342},{"sl":343},{"sl":344},{"sl":345},{"sl":346},{"sl":347},{"sl":348},{"sl":349},{"sl":351},{"sl":352}]},"test_1232":{"methods":[{"sl":132}],"name":"testFactory_parseMinutes_String","pass":true,"statements":[{"sl":133},{"sl":134},{"sl":135},{"sl":136},{"sl":137},{"sl":138},{"sl":139},{"sl":140},{"sl":145},{"sl":146}]},"test_1316":{"methods":[{"sl":306}],"name":"testMinus_Minutes","pass":true,"statements":[{"sl":307},{"sl":308},{"sl":309},{"sl":310},{"sl":311},{"sl":312},{"sl":314},{"sl":315},{"sl":317},{"sl":318}]},"test_1385":{"methods":[{"sl":187}],"name":"testToString","pass":true,"statements":[{"sl":188},{"sl":189},{"sl":191},{"sl":192}]},"test_1493":{"methods":[{"sl":114}],"name":"testFactory_standardMinutesIn_RPeriod","pass":true,"statements":[{"sl":115},{"sl":116},{"sl":117},{"sl":118},{"sl":119},{"sl":120},{"sl":121},{"sl":122},{"sl":123},{"sl":124},{"sl":125}]},"test_1654":{"methods":[{"sl":170}],"name":"testIsGreaterThan","pass":true,"statements":[{"sl":171},{"sl":172},{"sl":173},{"sl":174},{"sl":175}]},"test_1876":{"methods":[{"sl":373}],"name":"testAddToLocalDate","pass":true,"statements":[{"sl":374},{"sl":375},{"sl":376},{"sl":377}]},"test_198":{"methods":[{"sl":65}],"name":"testFactory_minutes_int","pass":true,"statements":[{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":70},{"sl":71},{"sl":72},{"sl":73}]},"test_2026":{"methods":[{"sl":55}],"name":"testConstants","pass":true,"statements":[{"sl":56},{"sl":57},{"sl":58},{"sl":59},{"sl":60},{"sl":61}]},"test_2064":{"methods":[{"sl":89}],"name":"testFactory_minutesBetween_RPartial","pass":true,"statements":[{"sl":90},{"sl":91},{"sl":92},{"sl":95},{"sl":96},{"sl":97},{"sl":98},{"sl":99}]},"test_2133":{"methods":[{"sl":359}],"name":"testNegated","pass":true,"statements":[{"sl":360},{"sl":361},{"sl":362},{"sl":364},{"sl":365}]},"test_2193":{"methods":[{"sl":271}],"name":"testPlus_Minutes","pass":true,"statements":[{"sl":272},{"sl":273},{"sl":274},{"sl":275},{"sl":276},{"sl":277},{"sl":279},{"sl":280},{"sl":282},{"sl":283}]},"test_2214":{"methods":[{"sl":178}],"name":"testIsLessThan","pass":true,"statements":[{"sl":179},{"sl":180},{"sl":181},{"sl":182},{"sl":183}]},"test_222":{"methods":[{"sl":226}],"name":"testToStandardHours","pass":true,"statements":[{"sl":227},{"sl":228},{"sl":229}]},"test_2320":{"methods":[{"sl":77}],"name":"testFactory_minutesBetween_RInstant","pass":true,"statements":[{"sl":78},{"sl":79},{"sl":80},{"sl":82},{"sl":83},{"sl":84},{"sl":85},{"sl":86}]},"test_270":{"methods":[{"sl":164}],"name":"testGetPeriodType","pass":true,"statements":[{"sl":165},{"sl":166}]},"test_364":{"methods":[{"sl":159}],"name":"testGetFieldType","pass":true,"statements":[{"sl":160},{"sl":161}]},"test_45":{"methods":[{"sl":214}],"name":"testToStandardWeeks","pass":true,"statements":[{"sl":215},{"sl":216},{"sl":217}]},"test_484":{"methods":[{"sl":245}],"name":"testToStandardDuration","pass":true,"statements":[{"sl":246},{"sl":247},{"sl":248},{"sl":250},{"sl":251}]},"test_562":{"methods":[{"sl":290}],"name":"testMinus_int","pass":true,"statements":[{"sl":291},{"sl":292},{"sl":293},{"sl":294},{"sl":296},{"sl":298},{"sl":299}]},"test_625":{"methods":[{"sl":196}],"name":"testSerialization","pass":true,"statements":[{"sl":197},{"sl":199},{"sl":200},{"sl":201},{"sl":202},{"sl":203},{"sl":205},{"sl":206},{"sl":207},{"sl":208},{"sl":210}]},"test_667":{"methods":[{"sl":232}],"name":"testToStandardSeconds","pass":true,"statements":[{"sl":233},{"sl":234},{"sl":235},{"sl":237},{"sl":238}]},"test_675":{"methods":[{"sl":154}],"name":"testGetMethods","pass":true,"statements":[{"sl":155},{"sl":156}]},"test_726":{"methods":[{"sl":325}],"name":"testMultipliedBy_int","pass":true,"statements":[{"sl":326},{"sl":327},{"sl":328},{"sl":329},{"sl":330},{"sl":332},{"sl":333},{"sl":334}]},"test_981":{"methods":[{"sl":102}],"name":"testFactory_minutesIn_RInterval","pass":true,"statements":[{"sl":103},{"sl":104},{"sl":105},{"sl":107},{"sl":108},{"sl":109},{"sl":110},{"sl":111}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2026], [2026], [2026], [2026], [2026], [2026], [2026], [], [], [], [198], [198], [198], [198], [198], [198], [198], [198], [198], [], [], [], [2320], [2320], [2320], [2320], [], [2320], [2320], [2320], [2320], [2320], [], [], [2064], [2064], [2064], [2064], [], [], [2064], [2064], [2064], [2064], [2064], [], [], [981], [981], [981], [981], [], [981], [981], [981], [981], [981], [], [], [1493], [1493], [1493], [1493], [1493], [1493], [1493], [1493], [1493], [1493], [1493], [1493], [], [], [], [], [], [], [1232], [1232], [1232], [1232], [1232], [1232], [1232], [1232], [1232], [], [], [], [], [1232], [1232], [], [], [], [], [], [], [], [675], [675], [675], [], [], [364], [364], [364], [], [], [270], [270], [270], [], [], [], [1654], [1654], [1654], [1654], [1654], [1654], [], [], [2214], [2214], [2214], [2214], [2214], [2214], [], [], [], [1385], [1385], [1385], [], [1385], [1385], [], [], [], [625], [625], [], [625], [625], [625], [625], [625], [], [625], [625], [625], [625], [], [625], [], [], [], [45], [45], [45], [45], [], [], [1055], [1055], [1055], [1055], [], [], [222], [222], [222], [222], [], [], [667], [667], [667], [667], [], [667], [667], [], [], [], [], [], [], [484], [484], [484], [484], [], [484], [484], [], [], [], [1076], [1076], [1076], [1076], [1076], [], [1076], [], [1076], [1076], [], [], [], [], [], [], [2193], [2193], [2193], [2193], [2193], [2193], [2193], [], [2193], [2193], [], [2193], [2193], [], [], [], [], [], [], [562], [562], [562], [562], [562], [], [562], [], [562], [562], [], [], [], [], [], [], [1316], [1316], [1316], [1316], [1316], [1316], [1316], [], [1316], [1316], [], [1316], [1316], [], [], [], [], [], [], [726], [726], [726], [726], [726], [726], [], [726], [726], [726], [], [], [], [], [], [], [1205], [1205], [1205], [1205], [1205], [1205], [1205], [1205], [1205], [], [1205], [1205], [], [], [], [], [], [], [2133], [2133], [2133], [2133], [], [2133], [2133], [], [], [], [], [], [], [], [1876], [1876], [1876], [1876], [1876], [], [], []]
