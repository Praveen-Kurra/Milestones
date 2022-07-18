var y = 0;
        var d=[];
        var desktop=0;
        var mobile=0;
        var laptop=0;
        function displayDetails() {
            var rows = 1;
            var x = 0;
            
            var arr1 = [];
            var arr2 = [];
            var arr3 = [];
            var arr4 = [];

            var MID = document.getElementById("MID");
            var Name = document.getElementById("Name");

            var ele1 = document.getElementById("DeviceType");
            var DeviceType = ele1.options[ele1.selectedIndex].text;

            var OS = document.querySelector('input[name="OS"]:checked');

            var display = document.getElementById('display');
            var newRow = display.insertRow(rows);

            arr1[x] = document.getElementById("MID").value;
            arr2[x] = document.getElementById("Name").value;
            arr3[x] = document.getElementById("DeviceType").value;
            arr4[x] = document.querySelector('input[name="OS"]:checked').value;
            console.log(OS);

            var cell1 = newRow.insertCell(0);
            var cell2 = newRow.insertCell(1);
            var cell3 = newRow.insertCell(2);
            var cell4 = newRow.insertCell(3);

            cell1.innerHTML = arr1[x];
            cell2.innerHTML = arr2[x];
            cell3.innerHTML = arr3[x];
            cell4.innerHTML = arr4[x];

            d[y] = document.getElementById("DeviceType").value;
           

            var o = document.querySelector('input[name="OS"]:checked').value;
            if(o=="32bit"){
               cell4.style.color="orange";
            }
           
            if(d[y]=="Desktop"){
             
                cell1.style.color="green";
                cell2.style.color="green";
                cell3.style.color="green";
                cell4.style.color="green";

            }
            var devicep=document.getElementById("DeviceType").value;
            if(devicep=="Laptop"){
               laptop+=1;

            }else if(devicep=="Desktop"){
                desktop+=1
            }
            else{
                mobile+=1;
            }

            x++;
            y++;
            rows++;
            alert("Have a Great Future Ahed");

        }

        function getCount() {
          

 if (mobile<laptop && mobile<desktop){
    document.getElementById('item').innerHTML="Mobile";
 }
 else if(laptop<mobile && laptop<desktop){
    document.getElementById('item').innerHTML="laptoe";
 }
 else{
    document.getElementById('item').innerHTML="Desktop";
            
        }
    }
        function validate(){
            var xMid=document.getElementById("MID").value;
            var regxMid=/^M[0-9]{7}$/;
            if(!regxMid.test(xMid)){
                alert("Please Enter a valid MID")
            }
            else{
                displayDetails()
            }

        }