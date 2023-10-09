function solution(year) {
    if (year <= 100) {
        return 1;
    }

    if (year <= '1000') {
        if (year.toString().slice(1) === '00') {
            return parseInt(year.toString().slice(0, 1));
        }
        return parseInt(year.toString().slice(0, 1)) + 1
    }

    if (year.toString().slice(2) === '00') {
        return parseInt(year.toString().slice(0, 2))
    }

    return parseInt(year.toString().slice(0, 2)) + 1
}
solution(4000);