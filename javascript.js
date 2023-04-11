const result = document.getElementById('result');
const keys = document.querySelector('.keys');
let input = '';

keys.addEventListener('click', (event) => {
  const key = event.target;
  const keyValue = key.value;

  if (key.classList.contains('operator')) {
    if (keyValue === 'AC') {
      input = '';
      result.value = '';
    } else if (keyValue === 'DEL') {
      input = input.slice(0, -1);
      result.value = input;
    } else if (keyValue === '=') {
      result.value = eval(input);
    } else {
      input += keyValue;
      result.value = input;
    }
  } else {
    input +=
