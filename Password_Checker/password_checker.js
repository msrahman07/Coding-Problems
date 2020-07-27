/**
 * @param {string} s
 * @return {number}
 */
function repeats(s, ed){
    let rep = 0, replaced = 0;
    let indexes = [];
    let limit = 0;
    if(s.length >= 20){
        limit = 18;
    }
    else{
        limit = s.length;
    }
    for(let i = 0; i < limit; i++){
        let edited = false;
        if(s[i]==s[i+1] && s[i]==s[i+2]){
            if(ed > 0){
                ed -= 1;
                replaced += 1;
                edited = true;
            }
            indexes.push(i+2);
            i += 2;
            if(!edited){
                if(s[i] == s[i+1]){
                    replaced += 1;
                }
                else{
                    rep += 1;
                }
            } 
        }
    }
    console.log(indexes)
    return {"rep":rep, "replaced":replaced, "edit":ed};
};
var strongPasswordChecker = function(s) {
    let strong = false,
        add = 0,
        del = 0,
        //replace = 0,
        edit = 0,
        noThreeRep = true, //must be true
        strLen = s.length
    console.log("string length: "+s.length)
    
    // for
    
    let noUp = false, noLower = false, noInt = false;
    if(strLen < 6){
        add = 6 - strLen;
    }
    if(strLen > 20){
        del = strLen - 20;
        //return charNumChange;
    }
    if(!RegExp('[A-Z]').test(s)){
        edit += 1;
        noUp = true;
    }
    if(!RegExp('[a-z]').test(s)){
        edit += 1;
        noLower = true;
    }
    if(!RegExp('[0-9]').test(s)){
        edit += 1;
        noInt = true;
    }
    let d_rep = "";
    let dl = "";
    for(let i = 0; i < strLen-1; i++){
        if(s[i] != s[i+1]){
            if(s[i] == s[i-1]){
                d_rep += s[i]
            }
            else{
                dl += s[i]                
            }
            if(i+1 == strLen-1){
                dl += s[i+1]
            }
            
        }
        else{
            d_rep += s[i]
            if(i+1 == strLen-1){
                d_rep += s[i+1]
            }
        }
    }
    console.log(dl)
    // if(dl != "" && s[strLen-1] != dl[dl.length -1]){
    //     dl += s[strLen-1]
    // }
    // else{
    //     d_rep += s[strLen-1];
    // }
    let lnn = dl.length;
    
    if(dl[lnn-1]==d_rep[0]){
        //console.log("yayayay")
        dl = dl[lnn-1] + dl.slice(0,lnn-1)
    }
    console.log(dl)
    //return 0;
    let st = s;
    s = dl+d_rep;
    console.log(s+"______")
    
    let replace = 0, min_change = 0;
    let e = edit, d = del;
    let limit = 0;
    if(s.length >= 20){
        limit = 18;
    }
    else{
        limit = s.length;
    }
    // if(strLen % 2 != 0){
    //     limit--;
    // }
    for(let i = 0; i < limit; i++){
        let edited = false;
        if(s[i]==s[i+1] && s[i]==s[i+2]){
            console.log(s.slice(i, i+3));
            console.log(s.slice(i-3, i));
            replace ++;
            if(edit > 0){
                edit -= 1;
                edited = true;
                console.log("edited")
            }
            if(st != s && s.slice(i-3, i) == s.slice(i, i+3) && del > 0 && !edited){
                console.log("dleeted")
                del--;
            }
            i += 2; 
        }
    }
    console.log("replace: "+replace+"\nEdit: "+edit+"\nDel: "+del)
    let totals = replace + edit + del
    
    if(add>=(totals)){
        return add;
    }
    return totals;
    
    
//     strong = false;
//     let total = 0;
//     let min_change = 0;
//     edit = repeats(s, edit).edit;
    
//     if(del >= repeat){
//         console.log("Printing del >= repeat")
//         min_change = edit + del + replaced;
//         //return min_change;
//     }
//     else if(del>0 && del<repeat){
//         console.log("Printing del < repeat && del > 0")
//         min_change = edit + (repeat - del) + replaced;
//     }
//     else{
//         console.log("Printing del < repeat && No deletes")
//         min_change = replaced;
//     }
//     if(add >= min_change){
//         return add;
//     }
//     console.log("Repeat: "+repeat+"\nReplaced: "+replaced+"\nDelete: "+del+"\nEdit: "+edit)
//     return min_change;
    
    let arr = [];
    let possible = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    //let min_change = 0;
    if(s.length >= 20){
        limit = 18;
    }
    else{
        limit = s.length;
    }
    // let replace = 0;
    // let e = edit, d = del;
    // for(let i = 0; i < strLen-2; i++){
    //     let edited = false;
    //     if(s[i]==s[i+1] && s[i]==s[i+2]){
    //         replace += 1;
    //         if(edit > 0){
    //             edit -= 1;
    //             replace -= 1;
    //             min_change += 1;
    //             edited = true;
    //             console.log("edited")
    //         }
    //         i += 2;
    //         if(!edited){
    //             if(s[i] == s[i+1]){
    //                 min_change += 1;
    //                 console.log("replaced same later")
    //             }
    //             else{
    //                 if(del > 0){
    //                     min_change += 1;
    //                     del -= 1;
    //                     console.log("deleted");
    //                 }
    //                 else{
    //                     min_change += 1;
    //                     console.log("replaced nothing to delete")
    //                 }
    //             }
    //         } 
    //     }
    // }
    let total =0;
    total =  min_change + edit + del;
    if(add>=total){
        return add;
    }
    console.log("Replace: "+replace+"\nEdit: "+e+"\nDelete: "+d);
    console.log("===========\nTotal: "+total);
    // if((d+e) >= min_change){
    //     return d+e;
    // }
    return total;
    //strLen -= del;
    //let min_change = 0
    
//     while(!strong){
//         replace = 0;
//         for(let i=0; i<strLen-2; i++){
//             if(s[i] == s[i+1] && s[i] == s[i+2]){
//                 replace += 1;
//                 let edited = false;
//                 let deleted = false;

//                 if(edit > 0){
//                     //replace -= 1;
//                     edit -= 1;
//                     if(noUp){
//                         min_change += 1
//                         console.log("min_changed increased for editing")
//                         s = s.slice(0,i+2)+'A'+s.slice(i+3);
//                         console.log(s[i+2]);
//                         noUp = false;
//                         edited = true;
//                     }
//                     if(!edited && noLower){
//                         min_change += 1
//                         console.log("min_changed increased for editing")
//                         s = s.slice(0,i+2)+'a'+s.slice(i+3);
//                         noLower = false;
//                         edited = true;
//                     }
//                     if(!edited && noInt){
//                         min_change += 1
//                         console.log("min_changed increased for editing")
//                         s = s.slice(0,i+2)+'1'+s.slice(i+3);
//                         edited = true;
//                     }
//                     //if(edit == 0edited = 1;
//                 }
//                 let replaced = false;
//                 if(!edited && s[i+2] == s[i+3]){
//                     min_change += 1
//                     //replace -= 1;
//                     let replaceWith = possible.charAt(Math.floor(Math.random() * possible.length));
//                     while(replaceWith == s[i+2]){
//                         replaceWith = possible.charAt(Math.floor(Math.random() * possible.length));
//                     }
//                     replaced = true;
//                     console.log("min_changed increased for replacing: "+s[i+2]+" with: "+replaceWith)
//                     s = s.slice(0,i+2) + replaceWith + s.slice(i+3);
//                 }
//                 if(!replaced && !edited && del > 0){
//                     min_change += 1
//                     console.log("min_changed increased for deleting: "+s[i+2])
//                     //replace -= 1;
//                     s = s.slice(0,i+2)+s.slice(i+3);
//                     del -= 1;
//                     deleted = true;
//                 }
//                 if(!replaced && !edited && !deleted){
//                     min_change += 1
//                     //replace -= 1;
//                     let replaceWith = possible.charAt(Math.floor(Math.random() * possible.length));
//                     while(replaceWith == s[i+2]){
//                         replaceWith = possible.charAt(Math.floor(Math.random() * possible.length));
//                     }
//                     replaced = true;
//                     console.log("min_changed increased for replacing: "+s[i+2]+" with: "+replaceWith)
//                     s = s.slice(0,i+2) + replaceWith + s.slice(i+3);
//                 }
                
//                 i+=2;
//             }        
//         }
        
        //console.log("min_change: "+min_change)
    //     if(replace <= 0){
    //         if(del > 0){
    //             strong = false;
    //             min_change += 1;
    //             del -= 1;
    //         }
    //         else{
    //             strong = true;
    //         }
    //     }
    // }
    console.log(s+": "+s.length);
    console.log("replace: "+replace+", edit: "+edit+", delete: "+del);
    
    
    min_change += edit+ del
    // if(min_change > 0){
    //     min_change = min_change + edit;
    // }
    // else{
    //     min_change = edit + del;
    // }
    
    
    return total;
    
};
