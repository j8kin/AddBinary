class Solution {
    private fun digit(a: Char):Int {
        return if (a == '0') 0 else 1
    }
    fun addBinary(a: String, b: String): String {
        if (a.isBlank())
            return b
        if (b.isBlank())
            return a

        var i = a.length-1
        var j = b.length-1
        var res = ""
        var add = 0
        while (i >= 0 || j >= 0) {
            var dig = 0
            if (i >= 0) dig += digit(a[i])
            if (j >= 0) dig += digit(b[j])
            if (add > 0) dig += add

            if (dig > 1) {
                dig -= 2
                add = 1
            }
            else {
                add = 0
            }

            res = "$dig$res"
            if (i >= 0) i--
            if (j >= 0) j--
        }
        if (add > 0) res = "1$res"
        return res
    }
}