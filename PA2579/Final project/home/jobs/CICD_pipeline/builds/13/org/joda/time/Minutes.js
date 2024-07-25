var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":471,"id":4072,"methods":[{"el":88,"sc":5,"sl":71},{"el":103,"sc":5,"sl":100},{"el":126,"sc":5,"sl":117},{"el":142,"sc":5,"sl":136},{"el":167,"sc":5,"sl":164},{"el":187,"sc":5,"sl":180},{"el":199,"sc":5,"sl":197},{"el":208,"sc":5,"sl":206},{"el":218,"sc":5,"sl":216},{"el":227,"sc":5,"sl":225},{"el":245,"sc":5,"sl":243},{"el":262,"sc":5,"sl":260},{"el":278,"sc":5,"sl":276},{"el":295,"sc":5,"sl":293},{"el":314,"sc":5,"sl":311},{"el":324,"sc":5,"sl":322},{"el":341,"sc":5,"sl":336},{"el":357,"sc":5,"sl":352},{"el":371,"sc":5,"sl":369},{"el":387,"sc":5,"sl":382},{"el":401,"sc":5,"sl":399},{"el":418,"sc":5,"sl":413},{"el":429,"sc":5,"sl":427},{"el":443,"sc":5,"sl":438},{"el":456,"sc":5,"sl":451},{"el":469,"sc":5,"sl":466}],"name":"Minutes","sl":42}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_100":{"methods":[{"sl":71},{"sl":197},{"sl":216}],"name":"testGetFieldType","pass":true,"statements":[{"sl":72},{"sl":85},{"sl":86},{"sl":198},{"sl":217}]},"test_1028":{"methods":[{"sl":71},{"sl":197},{"sl":322},{"sl":336},{"sl":369}],"name":"testMinus_int","pass":true,"statements":[{"sl":72},{"sl":77},{"sl":78},{"sl":85},{"sl":86},{"sl":198},{"sl":323},{"sl":337},{"sl":338},{"sl":340},{"sl":370}]},"test_1037":{"methods":[{"sl":71},{"sl":197},{"sl":276}],"name":"testToStandardHours","pass":true,"statements":[{"sl":72},{"sl":85},{"sl":86},{"sl":198},{"sl":277}]},"test_1095":{"methods":[{"sl":71},{"sl":197},{"sl":322},{"sl":336},{"sl":352}],"name":"testPlus_Minutes","pass":true,"statements":[{"sl":72},{"sl":77},{"sl":78},{"sl":79},{"sl":80},{"sl":85},{"sl":86},{"sl":198},{"sl":323},{"sl":337},{"sl":338},{"sl":340},{"sl":353},{"sl":354},{"sl":356}]},"test_1306":{"methods":[{"sl":71},{"sl":197},{"sl":311}],"name":"testToStandardDuration","pass":true,"statements":[{"sl":72},{"sl":85},{"sl":86},{"sl":198},{"sl":312},{"sl":313}]},"test_1371":{"methods":[{"sl":71},{"sl":197},{"sl":322},{"sl":336},{"sl":369},{"sl":382}],"name":"testMinus_Minutes","pass":true,"statements":[{"sl":72},{"sl":77},{"sl":78},{"sl":79},{"sl":80},{"sl":85},{"sl":86},{"sl":198},{"sl":323},{"sl":337},{"sl":338},{"sl":340},{"sl":370},{"sl":383},{"sl":384},{"sl":386}]},"test_1480":{"methods":[{"sl":71},{"sl":100},{"sl":197},{"sl":322}],"name":"testFactory_minutesBetween_RInstant","pass":true,"statements":[{"sl":72},{"sl":73},{"sl":74},{"sl":79},{"sl":80},{"sl":85},{"sl":86},{"sl":101},{"sl":102},{"sl":198},{"sl":323}]},"test_1486":{"methods":[{"sl":71},{"sl":180},{"sl":197},{"sl":322}],"name":"testFactory_parseMinutes_String","pass":true,"statements":[{"sl":72},{"sl":73},{"sl":74},{"sl":75},{"sl":76},{"sl":77},{"sl":78},{"sl":85},{"sl":86},{"sl":182},{"sl":183},{"sl":185},{"sl":186},{"sl":198},{"sl":323}]},"test_1514":{"methods":[{"sl":71},{"sl":293}],"name":"testToStandardSeconds","pass":true,"statements":[{"sl":72},{"sl":79},{"sl":80},{"sl":294}]},"test_1736":{"methods":[{"sl":71},{"sl":197},{"sl":322}],"name":"testToStandardMinutes","pass":true,"statements":[{"sl":72},{"sl":75},{"sl":76},{"sl":81},{"sl":82},{"sl":85},{"sl":86},{"sl":198},{"sl":323}]},"test_1870":{"methods":[{"sl":71},{"sl":197},{"sl":451}],"name":"testIsLessThan","pass":true,"statements":[{"sl":72},{"sl":85},{"sl":86},{"sl":198},{"sl":452},{"sl":453},{"sl":455}]},"test_1972":{"methods":[{"sl":71},{"sl":136},{"sl":197},{"sl":322}],"name":"testFactory_minutesIn_RInterval","pass":true,"statements":[{"sl":72},{"sl":73},{"sl":74},{"sl":79},{"sl":80},{"sl":85},{"sl":86},{"sl":137},{"sl":138},{"sl":140},{"sl":141},{"sl":198},{"sl":323}]},"test_2026":{"methods":[{"sl":71},{"sl":197},{"sl":322},{"sl":399}],"name":"testMultipliedBy_int","pass":true,"statements":[{"sl":72},{"sl":77},{"sl":78},{"sl":85},{"sl":86},{"sl":198},{"sl":323},{"sl":400}]},"test_2281":{"methods":[{"sl":71},{"sl":197},{"sl":225}],"name":"testToStandardMinutes","pass":true,"statements":[{"sl":72},{"sl":73},{"sl":74},{"sl":75},{"sl":76},{"sl":77},{"sl":78},{"sl":85},{"sl":86},{"sl":198},{"sl":226}]},"test_2305":{"methods":[{"sl":71},{"sl":197},{"sl":225}],"name":"testToStandardMinutes","pass":true,"statements":[{"sl":72},{"sl":85},{"sl":86},{"sl":198},{"sl":226}]},"test_2311":{"methods":[{"sl":71},{"sl":197},{"sl":260}],"name":"testToStandardDays","pass":true,"statements":[{"sl":72},{"sl":85},{"sl":86},{"sl":198},{"sl":261}]},"test_2362":{"methods":[{"sl":71},{"sl":197},{"sl":243}],"name":"testToStandardWeeks","pass":true,"statements":[{"sl":72},{"sl":85},{"sl":86},{"sl":198},{"sl":244}]},"test_2366":{"methods":[{"sl":71},{"sl":197},{"sl":322}],"name":"testGetMethods","pass":true,"statements":[{"sl":72},{"sl":85},{"sl":86},{"sl":198},{"sl":323}]},"test_2405":{"methods":[{"sl":71},{"sl":197},{"sl":322},{"sl":413}],"name":"testDividedBy_int","pass":true,"statements":[{"sl":72},{"sl":77},{"sl":78},{"sl":79},{"sl":80},{"sl":85},{"sl":86},{"sl":198},{"sl":323},{"sl":414},{"sl":415},{"sl":417}]},"test_2409":{"methods":[{"sl":71},{"sl":206}],"name":"testSerialization","pass":true,"statements":[{"sl":72},{"sl":79},{"sl":80},{"sl":207}]},"test_2423":{"methods":[{"sl":322}],"name":"testConstants","pass":true,"statements":[{"sl":323}]},"test_2586":{"methods":[{"sl":71},{"sl":197},{"sl":322}],"name":"testFactory_minutes_int","pass":true,"statements":[{"sl":72},{"sl":73},{"sl":74},{"sl":75},{"sl":76},{"sl":77},{"sl":78},{"sl":79},{"sl":80},{"sl":81},{"sl":82},{"sl":83},{"sl":84},{"sl":85},{"sl":86},{"sl":198},{"sl":323}]},"test_2822":{"methods":[{"sl":71},{"sl":164},{"sl":197},{"sl":322}],"name":"testFactory_standardMinutesIn_RPeriod","pass":true,"statements":[{"sl":72},{"sl":73},{"sl":74},{"sl":75},{"sl":76},{"sl":77},{"sl":78},{"sl":85},{"sl":86},{"sl":165},{"sl":166},{"sl":198},{"sl":323}]},"test_2841":{"methods":[{"sl":71},{"sl":322}],"name":"testToStandardMinutes_years","pass":true,"statements":[{"sl":72},{"sl":73},{"sl":74},{"sl":323}]},"test_2851":{"methods":[{"sl":71},{"sl":197},{"sl":225}],"name":"testToStandardMinutes","pass":true,"statements":[{"sl":72},{"sl":85},{"sl":86},{"sl":198},{"sl":226}]},"test_2978":{"methods":[{"sl":71},{"sl":197},{"sl":225}],"name":"testToStandardMinutes","pass":true,"statements":[{"sl":72},{"sl":85},{"sl":86},{"sl":198},{"sl":226}]},"test_361":{"methods":[{"sl":71}],"name":"testToStandardMinutes","pass":true,"statements":[{"sl":72},{"sl":77},{"sl":78}]},"test_468":{"methods":[{"sl":71},{"sl":197},{"sl":225}],"name":"testGetPeriodType","pass":true,"statements":[{"sl":72},{"sl":85},{"sl":86},{"sl":198},{"sl":226}]},"test_495":{"methods":[{"sl":71},{"sl":197},{"sl":466}],"name":"testToString","pass":true,"statements":[{"sl":72},{"sl":85},{"sl":86},{"sl":198},{"sl":468}]},"test_572":{"methods":[{"sl":71},{"sl":197},{"sl":322},{"sl":427}],"name":"testNegated","pass":true,"statements":[{"sl":72},{"sl":85},{"sl":86},{"sl":198},{"sl":323},{"sl":428}]},"test_607":{"methods":[{"sl":71},{"sl":180},{"sl":197},{"sl":225},{"sl":466}],"name":"testMinutes","pass":true,"statements":[{"sl":72},{"sl":85},{"sl":86},{"sl":182},{"sl":185},{"sl":186},{"sl":198},{"sl":226},{"sl":468}]},"test_609":{"methods":[{"sl":71},{"sl":322}],"name":"testToStandardMinutes_months","pass":true,"statements":[{"sl":72},{"sl":73},{"sl":74},{"sl":323}]},"test_671":{"methods":[{"sl":71},{"sl":197},{"sl":322},{"sl":336}],"name":"testPlus_int","pass":true,"statements":[{"sl":72},{"sl":77},{"sl":78},{"sl":85},{"sl":86},{"sl":198},{"sl":323},{"sl":337},{"sl":338},{"sl":340}]},"test_902":{"methods":[{"sl":71},{"sl":197},{"sl":216}],"name":"testAddToLocalDate","pass":true,"statements":[{"sl":72},{"sl":85},{"sl":86},{"sl":198},{"sl":217}]},"test_960":{"methods":[{"sl":71},{"sl":117},{"sl":197},{"sl":216},{"sl":322}],"name":"testFactory_minutesBetween_RPartial","pass":true,"statements":[{"sl":72},{"sl":73},{"sl":74},{"sl":79},{"sl":80},{"sl":85},{"sl":86},{"sl":118},{"sl":119},{"sl":120},{"sl":122},{"sl":124},{"sl":125},{"sl":198},{"sl":217},{"sl":323}]},"test_984":{"methods":[{"sl":71},{"sl":197},{"sl":438}],"name":"testIsGreaterThan","pass":true,"statements":[{"sl":72},{"sl":85},{"sl":86},{"sl":198},{"sl":439},{"sl":440},{"sl":442}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1371, 1514, 572, 1972, 495, 361, 1736, 2366, 2841, 1037, 1480, 960, 902, 609, 2305, 1486, 2822, 1306, 2409, 1095, 2311, 1870, 671, 2405, 2586, 607, 1028, 2281, 2851, 100, 2026, 2978, 984, 468, 2362], [1371, 1514, 572, 1972, 495, 361, 1736, 2366, 2841, 1037, 1480, 960, 902, 609, 2305, 1486, 2822, 1306, 2409, 1095, 2311, 1870, 671, 2405, 2586, 607, 1028, 2281, 2851, 100, 2026, 2978, 984, 468, 2362], [1972, 2841, 1480, 960, 609, 1486, 2822, 2586, 2281], [1972, 2841, 1480, 960, 609, 1486, 2822, 2586, 2281], [1736, 1486, 2822, 2586, 2281], [1736, 1486, 2822, 2586, 2281], [1371, 361, 1486, 2822, 1095, 671, 2405, 2586, 1028, 2281, 2026], [1371, 361, 1486, 2822, 1095, 671, 2405, 2586, 1028, 2281, 2026], [1371, 1514, 1972, 1480, 960, 2409, 1095, 2405, 2586], [1371, 1514, 1972, 1480, 960, 2409, 1095, 2405, 2586], [1736, 2586], [1736, 2586], [2586], [2586], [1371, 572, 1972, 495, 1736, 2366, 1037, 1480, 960, 902, 2305, 1486, 2822, 1306, 1095, 2311, 1870, 671, 2405, 2586, 607, 1028, 2281, 2851, 100, 2026, 2978, 984, 468, 2362], [1371, 572, 1972, 495, 1736, 2366, 1037, 1480, 960, 902, 2305, 1486, 2822, 1306, 1095, 2311, 1870, 671, 2405, 2586, 607, 1028, 2281, 2851, 100, 2026, 2978, 984, 468, 2362], [], [], [], [], [], [], [], [], [], [], [], [], [], [1480], [1480], [1480], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [960], [960], [960], [960], [], [960], [], [960], [960], [], [], [], [], [], [], [], [], [], [], [1972], [1972], [1972], [], [1972], [1972], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2822], [2822], [2822], [], [], [], [], [], [], [], [], [], [], [], [], [], [1486, 607], [], [1486, 607], [1486], [], [1486, 607], [1486, 607], [], [], [], [], [], [], [], [], [], [], [1371, 572, 1972, 495, 1736, 2366, 1037, 1480, 960, 902, 2305, 1486, 2822, 1306, 1095, 2311, 1870, 671, 2405, 2586, 607, 1028, 2281, 2851, 100, 2026, 2978, 984, 468, 2362], [1371, 572, 1972, 495, 1736, 2366, 1037, 1480, 960, 902, 2305, 1486, 2822, 1306, 1095, 2311, 1870, 671, 2405, 2586, 607, 1028, 2281, 2851, 100, 2026, 2978, 984, 468, 2362], [], [], [], [], [], [], [], [2409], [2409], [], [], [], [], [], [], [], [], [960, 902, 100], [960, 902, 100], [], [], [], [], [], [], [], [2305, 607, 2281, 2851, 2978, 468], [2305, 607, 2281, 2851, 2978, 468], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2362], [2362], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2311], [2311], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1037], [1037], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1514], [1514], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1306], [1306], [1306], [], [], [], [], [], [], [], [], [1371, 572, 1972, 2423, 1736, 2366, 2841, 1480, 960, 609, 1486, 2822, 1095, 671, 2405, 2586, 1028, 2026], [1371, 572, 1972, 2423, 1736, 2366, 2841, 1480, 960, 609, 1486, 2822, 1095, 671, 2405, 2586, 1028, 2026], [], [], [], [], [], [], [], [], [], [], [], [], [1371, 1095, 671, 1028], [1371, 1095, 671, 1028], [1371, 1095, 671, 1028], [], [1371, 1095, 671, 1028], [], [], [], [], [], [], [], [], [], [], [], [1095], [1095], [1095], [], [1095], [], [], [], [], [], [], [], [], [], [], [], [], [1371, 1028], [1371, 1028], [], [], [], [], [], [], [], [], [], [], [], [1371], [1371], [1371], [], [1371], [], [], [], [], [], [], [], [], [], [], [], [], [2026], [2026], [], [], [], [], [], [], [], [], [], [], [], [], [2405], [2405], [2405], [], [2405], [], [], [], [], [], [], [], [], [], [572], [572], [], [], [], [], [], [], [], [], [], [984], [984], [984], [], [984], [], [], [], [], [], [], [], [], [1870], [1870], [1870], [], [1870], [], [], [], [], [], [], [], [], [], [], [495, 607], [], [495, 607], [], [], []]
