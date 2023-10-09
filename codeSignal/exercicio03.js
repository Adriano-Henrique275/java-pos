function solution(inputString) {
    const palidrome = inputString.split("").reverse();
    const isPalidrom = inputString === palidrome.join("");   

    return isPalidrom;
}