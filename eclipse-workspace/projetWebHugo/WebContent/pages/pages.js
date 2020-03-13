(function(){
  "use secure";
  var listA, listSpan, pred, suiv, lA, lS, max, curr;
  
  function init(){
    listA = document.querySelectorAll('#pages > a.num');
    lA = listA.length;
    listSpan = document.querySelectorAll('#pages > span');
    lS = listSpan.length;
    pred = document.querySelectorAll('#pages > a.ps')[0];
    suiv = document.querySelectorAll('#pages > a.ps')[1];
    max = 25;
    curr = 1;
    document.getElementById('pages').addEventListener('click',function(e){
      if (e.target.tagName == "A"){
        switch (e.target.text){
          case ' Pred.':
            curr -= 1;
            break;
          case 'Suiv. ':
            curr += 1;
            break;
          default:
            curr = parseInt(e.target.text);
        }
        setAffichage()
      }
    });
    document.getElementById('pages').addEventListener('submit', function(e){
      e.preventDefault();
      var input, val;
      input = document.querySelector('#pages form input[type=text]');
      val = parseInt(input.value);
      if (val && !(val < 1 || val > max)){
        curr = val;
      }
      input.value = 1;
      setAffichage();
    });
    setAffichage();
  }

  function setAffichage(){
    affichage();
    remplissage();
    select();
  }
  
  function affichage(){ // si max > 8
    resetSel();
    hideSpan();
    afficheAllA();
    switch (curr){
      case 1:
        affichePred(false);
        afficheSuiv();
        afficheSpan(2);
        break;
      case 2:
      case 3:
      case 4:
        affichePred();
        afficheSuiv();
        afficheSpan(3);
        break;
      case max-4:
      case max-3:
      case max-2:
      case max-1:
        affichePred();
        afficheSuiv();
        afficheSpan(0);
        break;
      case max:
        affichePred();
        afficheSuiv(false);
        afficheSpan(1);
        break;
      default:
        affichePred();
        afficheSuiv();
        afficheSpan(0);
        afficheSpan(3);
    }
  }

  function remplissage(){
    switch (curr){
      case 1:
        listA[0].innerHTML = 1;
        listA[1].innerHTML = 2;
        listA[2].innerHTML = 3;
        listA[3].innerHTML = 4;
        listA[4].innerHTML = 5;
        listA[5].innerHTML = 6;
        listA[7].innerHTML = max-1;
        listA[8].innerHTML = max;
        break;
      case 2:
      case 3:
      case 4:
        listA[1].innerHTML = 1;
        listA[2].innerHTML = 2;
        listA[3].innerHTML = 3;
        listA[4].innerHTML = 4;
        listA[5].innerHTML = 5;
        listA[6].innerHTML = 6;
        listA[8].innerHTML = max;
        break;
      case max-4:
      case max-3:
      case max-2:
      case max-1:
        listA[1].innerHTML = 1;
        listA[3].innerHTML = max-5;
        listA[4].innerHTML = max-4;
        listA[5].innerHTML = max-3;
        listA[6].innerHTML = max-2;
        listA[7].innerHTML = max-1;
        listA[8].innerHTML = max;
        break;
      case max:
        listA[1].innerHTML = 1;
        listA[2].innerHTML = 2;
        listA[4].innerHTML = max-5;
        listA[5].innerHTML = max-4;
        listA[6].innerHTML = max-3;
        listA[7].innerHTML = max-2;
        listA[8].innerHTML = max-1;
        listA[9].innerHTML = max;
        break;
      default:
        listA[1].innerHTML = 1;
        listA[8].innerHTML = max;
        listA[3].innerHTML = curr-1;
        listA[4].innerHTML = curr;
        listA[5].innerHTML = curr+1;
        listA[6].innerHTML = curr+2;
    }
  }

  function select(){
    switch (curr){
      case 1:
        listA[0].className = "num sel";
        break;
      case 2:
        listA[2].className = "num sel";
        break;
      case 3:
        listA[3].className = "num sel";
        break;
      case max-3:
        listA[5].className = "num sel";
        break;
      case max-2:
        listA[6].className = "num sel";
        break;
      case max-1:
        listA[7].className = "num sel";
        break;
      case max:
        listA[9].className = "num sel";
        break;
      default:
        listA[4].className = "num sel";
    }
  }

  function hideSpan(){
    for (let i=0; i<lS; i++){
      listSpan[i].style.display = 'none';
    }
    for (let i=0; i>lA; i++){
      listA[i].style.display = 'inline-block';
    }
  }

  function resetSel(){
    for (let i=0; i<lA; i++){
      listA[i].className = "num";
    }
  }

  function affichePred(b){
    if (b == undefined) b = true;
    if (b){
      pred.style.display = 'inline-block';
      listA[0].style.display = 'none';
    }
    else{
      pred.style.display = 'none';
      listA[0].style.display = 'inline-block';
    }
  }

  function afficheSuiv(b){
    if (b == undefined) b = true;
    if (b){
      suiv.style.display = 'inline-block';
      listA[9].style.display = 'none';
    }
    else{
      suiv.style.display = 'none';
      listA[9].style.display = 'inline-block';
    }
  }

  function afficheSpan(nu){
    switch (nu){
      case 0:
        listSpan[0].style.display = 'inline-block';
        listA[2].style.display = 'none';
        break;
      case 1:
        listSpan[1].style.display = 'inline-block';
        listA[3].style.display = 'none';
        break;
      case 2:
        listSpan[2].style.display = 'inline-block';
        listA[6].style.display = 'none';
        break;
      case 3:
        listSpan[3].style.display = 'inline-block';
        listA[7].style.display = 'none';
        break;
    }
  }

  function afficheAllA(){
    for (let i=0; i<lA; i++){
      listA[i].style.display = 'inline-block';
    }
  }

  init();

})();
