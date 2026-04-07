void main() {
    int a = 1, b = 2;
    System.out.println(sumCal(a,b));
}

static int sumCal(int... numbers) {
    int sum = 0;
    for (int i : numbers) {
        sum += i;
    }
    return sum;
}


