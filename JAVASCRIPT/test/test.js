import assert from 'assert';
import {add} from '../src/third.js';

describe("Function",function(){
it("ans is 5 if you add 2 and 3",function(){
assert.strictEqual(add(2,3),5)
})
it("ans is 10 if you add 5 and 5",function(){
assert.strictEqual(add(5,5),10)
})
})