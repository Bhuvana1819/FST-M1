	
import pytest
@pytest.mark.great
def test_greater():
	x = 2
	y = 5
	assert y > x
	
@pytest.mark.great
def test_greater_equal():
	x = 6
	y = 6
	assert y >= x
 
@pytest.mark.others
def test_lesser():
    num1 = 10
    num2 = 10
    assert num1/num2 == 1
@pytest.mark.activities
def test_lesser():
    num1 = 100
    num2 = 100
    assert num1/num2 == 1
@pytest.mark.activities
def test_lesser():
    num1 = 5
    num2 = 5
    assert num1/num2 == 1