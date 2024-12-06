<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>body_Demande de paiement                   _ee811b</name>
   <tag></tag>
   <elementGuidId>ebf7dff0-38a8-4e48-8743-ab99e888b3aa</elementGuidId>
   <selectorCollection>
      <entry>
         <key>CSS</key>
         <value>body</value>
      </entry>
      <entry>
         <key>XPATH</key>
         <value>//body</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>body</value>
      <webElementGuid>60671453-1fd6-4f4a-a2dc-fe77a739da9f</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>



    
    
        
            
                
                    
                        
                        Demande de paiement
                    
                

                
                    
                        
                            
                               
                            
                        
                    
                
                
                    if( window.location.href.substring(window.location.href.indexOf('#')) == &quot;#ProcReturnCode=&amp;ErrMsg=&quot;)
                    {
                        document.getElementById(&quot;b-alert&quot;).innerHTML =  &quot;Impossible de procéder au paiement&quot;;
                        document.getElementById(&quot;div-row&quot;).style.display = &quot;block&quot;;
                    }else
                    if(getParameterByName('ErrMsg') &amp;&amp; getParameterByName('ProcReturnCode'))
                    {
                        document.getElementById(&quot;b-alert&quot;).innerHTML =  atob(getParameterByName('ErrMsg')) + ' (' + getParameterByName('ProcReturnCode') + ')';
                        document.getElementById(&quot;div-row&quot;).style.display = &quot;block&quot;;
                    }
                

                




                    
                                            
                                            
                                                Détail de Paiement vendredi, août 11, 2023 11:43:40
                                            
                                            

                                                
                                                
                                                    
                                                        
                                                             Modes de paiement : 
                                        
                                        
                                            
                                        
                                    
                            
                        















































                        
                            
                                 
                        

                        
						
						
						
													
							$('input:radio[name=&quot;paymentType&quot;]').change(
								function(){
									if ($(this).is(':checked') &amp;&amp; $(this).val() == 'UPOP') {
										$('#zoncardHolderName').hide();
										$('#zonCard_ExpDate').hide();
										$('#zonecvv').hide();
										$(&quot;input[name='cardHolderName']&quot;).removeAttr('required');
										$(&quot;input[name='cv2']&quot;).removeAttr('required');
									}else
									{
										$('#zoncardHolderName').show();
										$('#zonCard_ExpDate').show();
										$('#zonecvv').show();
										$(&quot;input[name='cardHolderName']&quot;).prop('required',true);
										$(&quot;input[name='cv2']&quot;).prop('required',true);
									}
								});
						


                        
                             Nom du porteur de la carte
                            
                        
                        
                             Numéro de carte de paiement
                            
                        

                        
                             Date d'expiration
                            
                                
                                    
                                        
                                            01
                                            02
                                            03
                                            04
                                            05
                                            06
                                            07
                                            08
                                            09
                                            10
                                            11
                                            12
                                        
                                    
                                    

                                    
                                    
                                        
20232024202520262027202820292030203120322033203420352036203720382039204020412042                                            @@years@@
                                        
                                    
                                    

                                    
                                
                            
                        
                        
                             Code de vérification
                            
                                
                                    
                                        
                                        
                                    
                                    
                                         (?)
                                    
                                    

                                    
                                
                            
                        

                        
                       
                        
                        

                        
                             
                            Confirmer l'acceptation des conditions générales d’utilisation du service 
                        

                       

                    
                    
                        Les informations sur le paiement vous concernant resteront confidentielles.
                    

                
            
            
            
            
                        
                            
                                Détail de la commande
                            

                            
                            
                                
                                    
                                    
                                        
                                            Identifiant
                                        
                                        
                                            :
                                        
                                        
                                            DE-242480_1691750437274
                                        
                                    
                                    
                                    
                                
                            
                             
                            
                                 
                                    
                                        
                                            Code
                                            Id
                                            Description
                                            Montant
                                        
                                    
									
										 											Direction Générale des Impôts Droits d’enregistrement											468805											Direction Générale des Impôts Droits d’enregistrement											0											MAD 																				 										 											Direction de l’imprimerie officielle frais d’insertion au bulletin officiel											468806											Direction de l’imprimerie officielle frais d’insertion au bulletin officiel											400											MAD 																				 										 											Ministère de la Justice Taxe judiciaire											468807											Ministère de la Justice Taxe judiciaire											350											MAD 																				 										 											Frais de gestion											468808											Frais de gestion											0											MAD 																				 										 											Frais de traitement 											468809											Frais de traitement 											8.25											MAD 																				 
									
                                   
										
                                        
                                            Total
                                           
										   
										  MAD
                                  
                                        
                                        
                                           
										   
                                  
                                        
										                               
                                        
                                            Change
                                            

                                              
59.90 GBP75.07 USD70.52 EUR                                                  @@exchangeamounts@@
                                              
                                              
                                        
                                        
                                        
                                        La valeur en devise est approximative sous réserve des variations des taux de change journaliers
                                        
                                     
                                  
                            
                          




                        
                
                
            
                
                    
                        Détail Marchand
                    
                    
                        
                            
                                
                                    Nom du marchand
                                
                                
                                    :
                                
                                
                                    Direct Entreprise (600000304)
                                
                            
                        

                    
                
            


                    
                        
                            
                                Informations du Client
                            
                            
                                
                                    
                                        
                                            Nom
                                        
                                        
                                            :
                                        
                                        
                                            Hakim
                                        
                                    
                                    
                                        
                                            Adresse
                                        
                                        
                                            :
                                        
                                        
                                            
                                        
                                    
                                    
                                        
                                            Tél
                                        
                                        
                                            :
                                        
                                        
                                            
                                        
                                    
                                    
                                        
                                            E-mail
                                        
                                        
                                            :
                                        
                                        
                                            alt.do-5evyxk6@yopmail.com
                                        
                                    
                                
                            
                        
                    
					
                     
                            
                            
                                
                                    
                                        Valider le paiement
                                    
                                    
                                    
                                    
                                
                            
                        
						
                            
                                
                            
                        
					



            
            
            
                
                    
                        
                            
                                
                                    
                                        
                                    
                                    
                                         Centre Monétique Interbancaire 
                                    
                                
                            

                            
                            
                                
                                
                                
                                
                            
                        

                    
                
            

        



        
    
    
    
    
    
    
    
	
	
	
		if($('input[value=&quot;MERCHANTSURCHARGE&quot;]').length == 0 &amp;&amp; $( &quot;input[name$='MERCHANTSURCHARGE']&quot; ).val() != &quot;&quot; &amp;&amp; $( &quot;input[name$='DIMCRITERIA5']&quot; ).length > 0 &amp;&amp; $( &quot;input[name$='DIMCRITERIA5']&quot; ).val() != &quot;&quot; )
		{

			SURCHARGE = $( &quot;input[name$='MERCHANTSURCHARGE']&quot; ).val();
			
			
			if($( &quot;input[name$='DIMCRITERIA5']&quot; ).val() == &quot;LOC&quot;)
			{
				netamount = 758.25/1.0110;
			}
			
			if($( &quot;input[name$='DIMCRITERIA5']&quot; ).val() == &quot;INT&quot;)
			{
				netamount = 758.25/1.0275;
			}
			
			
			netcharge = 758.25 - netamount.toFixed(2);
			
			var diff = Math.abs((parseFloat(netcharge).toFixed(2) - parseFloat(SURCHARGE).toFixed(2)).toFixed(2));
			
			//alert(&quot;ok&quot;);
		
			if(diff > 0.1  || SURCHARGE == 0 || SURCHARGE == &quot;&quot;) 
			{
				alert(&quot;Impossible de procéder au paiement à cause d’une erreur de calcul du montant de votre transaction.\nVous allez être redirigés vers le site pour réessayer.&quot;);
				document.location.href=&quot;&quot;;
			}
			
		}else
		{
			alert(&quot;Impossible de procéder au paiement à cause d’une erreur de calcul du montant de votre transaction.\nVous allez être redirigés vers le site pour réessayer.&quot;);
			document.location.href=&quot;&quot;;
		}
		

		
		
		
		
        amountCur = $( &quot;input[name$='amountCur']&quot; );
        symbolCur = $( &quot;input[name$='symbolCur']&quot; );
        currenciesList = $( &quot;input[name$='currenciesList']&quot; );
        if ( amountCur.length > 0 &amp;&amp;  symbolCur.length > 0 &amp;&amp; amountCur.val() != &quot;&quot; &amp;&amp; symbolCur.val() != &quot;&quot;)
        {

            $('#amountCurspan').html(amountCur.val());
            $('#amountCurspan').html(amountCur.val());
            $('#symbolCurspan').html(symbolCur.val());
            $('#curdiv').show();
            
            $('#amountCurspan2').html(amountCur.val());
            $('#symbolCurspan2').html(symbolCur.val());
            $('#curdiv2').show();

        }

        if ( currenciesList.length > 0  &amp;&amp; currenciesList.val().toUpperCase() == &quot;TRUE&quot;)
        {
            $('#Change').show();
            $('#Change2').show();
        }

        if ( (amountCur.length > 0 &amp;&amp;  symbolCur.length > 0 &amp;&amp; amountCur.val() != &quot;&quot; &amp;&amp; symbolCur.val() != &quot;&quot;) || (currenciesList.length > 0 &amp;&amp; currenciesList.val().toUpperCase() == &quot;TRUE&quot; ))
        {
            $('#Changemessage').show();
            $('#Changemessage2').show();
        }

        
    function isChecked(checkedBox){

        var checkedValue=parseFloat(checkedBox.value);
        var amount=parseFloat(document.getElementById('amount').value);
        var totalAmount=0;
        if (document.getElementById(checkedBox.id).checked)  {
            totalAmount= parseFloat(Number(amount+checkedValue)).toFixed(2);
        }else {
            totalAmount= parseFloat(Number(amount-checkedValue)).toFixed(2);
        }


        document.getElementById(&quot;amount&quot;).value=totalAmount;
    }
    $(document).ready(function(){
        if(!isNaN(document.getElementById(&quot;installment-wrapper&quot;).getAttribute(&quot;data-installment&quot;)) ){
            document.getElementById(&quot;installment-wrapper&quot;).style.display='block';
            document.getElementById(&quot;installment-param-wrapper&quot;).style.display='block';
            document.getElementById(&quot;installment-select-wrapper&quot;).innerHTML=&quot;&quot;;
            document.getElementById(&quot;installment-select-wrapper&quot;).style.display='none';

        }
    });



    

    
    



id(&quot;pan&quot;)</value>
      <webElementGuid>2ab2bacd-ba24-4a19-90db-e193906b345b</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[1]/body[1]</value>
      <webElementGuid>58dc6651-c7e5-4633-8dd9-caea184a951e</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//body</value>
      <webElementGuid>691556ae-c52b-44c9-9d71-afc408371b02</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//body[(text() = concat(&quot;



    
    
        
            
                
                    
                        
                        Demande de paiement
                    
                

                
                    
                        
                            
                               
                            
                        
                    
                
                
                    if( window.location.href.substring(window.location.href.indexOf(&quot; , &quot;'&quot; , &quot;#&quot; , &quot;'&quot; , &quot;)) == &quot;#ProcReturnCode=&amp;ErrMsg=&quot;)
                    {
                        document.getElementById(&quot;b-alert&quot;).innerHTML =  &quot;Impossible de procéder au paiement&quot;;
                        document.getElementById(&quot;div-row&quot;).style.display = &quot;block&quot;;
                    }else
                    if(getParameterByName(&quot; , &quot;'&quot; , &quot;ErrMsg&quot; , &quot;'&quot; , &quot;) &amp;&amp; getParameterByName(&quot; , &quot;'&quot; , &quot;ProcReturnCode&quot; , &quot;'&quot; , &quot;))
                    {
                        document.getElementById(&quot;b-alert&quot;).innerHTML =  atob(getParameterByName(&quot; , &quot;'&quot; , &quot;ErrMsg&quot; , &quot;'&quot; , &quot;)) + &quot; , &quot;'&quot; , &quot; (&quot; , &quot;'&quot; , &quot; + getParameterByName(&quot; , &quot;'&quot; , &quot;ProcReturnCode&quot; , &quot;'&quot; , &quot;) + &quot; , &quot;'&quot; , &quot;)&quot; , &quot;'&quot; , &quot;;
                        document.getElementById(&quot;div-row&quot;).style.display = &quot;block&quot;;
                    }
                

                




                    
                                            
                                            
                                                Détail de Paiement vendredi, août 11, 2023 11:43:40
                                            
                                            

                                                
                                                
                                                    
                                                        
                                                             Modes de paiement : 
                                        
                                        
                                            
                                        
                                    
                            
                        















































                        
                            
                                 
                        

                        
						
						
						
													
							$(&quot; , &quot;'&quot; , &quot;input:radio[name=&quot;paymentType&quot;]&quot; , &quot;'&quot; , &quot;).change(
								function(){
									if ($(this).is(&quot; , &quot;'&quot; , &quot;:checked&quot; , &quot;'&quot; , &quot;) &amp;&amp; $(this).val() == &quot; , &quot;'&quot; , &quot;UPOP&quot; , &quot;'&quot; , &quot;) {
										$(&quot; , &quot;'&quot; , &quot;#zoncardHolderName&quot; , &quot;'&quot; , &quot;).hide();
										$(&quot; , &quot;'&quot; , &quot;#zonCard_ExpDate&quot; , &quot;'&quot; , &quot;).hide();
										$(&quot; , &quot;'&quot; , &quot;#zonecvv&quot; , &quot;'&quot; , &quot;).hide();
										$(&quot;input[name=&quot; , &quot;'&quot; , &quot;cardHolderName&quot; , &quot;'&quot; , &quot;]&quot;).removeAttr(&quot; , &quot;'&quot; , &quot;required&quot; , &quot;'&quot; , &quot;);
										$(&quot;input[name=&quot; , &quot;'&quot; , &quot;cv2&quot; , &quot;'&quot; , &quot;]&quot;).removeAttr(&quot; , &quot;'&quot; , &quot;required&quot; , &quot;'&quot; , &quot;);
									}else
									{
										$(&quot; , &quot;'&quot; , &quot;#zoncardHolderName&quot; , &quot;'&quot; , &quot;).show();
										$(&quot; , &quot;'&quot; , &quot;#zonCard_ExpDate&quot; , &quot;'&quot; , &quot;).show();
										$(&quot; , &quot;'&quot; , &quot;#zonecvv&quot; , &quot;'&quot; , &quot;).show();
										$(&quot;input[name=&quot; , &quot;'&quot; , &quot;cardHolderName&quot; , &quot;'&quot; , &quot;]&quot;).prop(&quot; , &quot;'&quot; , &quot;required&quot; , &quot;'&quot; , &quot;,true);
										$(&quot;input[name=&quot; , &quot;'&quot; , &quot;cv2&quot; , &quot;'&quot; , &quot;]&quot;).prop(&quot; , &quot;'&quot; , &quot;required&quot; , &quot;'&quot; , &quot;,true);
									}
								});
						


                        
                             Nom du porteur de la carte
                            
                        
                        
                             Numéro de carte de paiement
                            
                        

                        
                             Date d&quot; , &quot;'&quot; , &quot;expiration
                            
                                
                                    
                                        
                                            01
                                            02
                                            03
                                            04
                                            05
                                            06
                                            07
                                            08
                                            09
                                            10
                                            11
                                            12
                                        
                                    
                                    

                                    
                                    
                                        
20232024202520262027202820292030203120322033203420352036203720382039204020412042                                            @@years@@
                                        
                                    
                                    

                                    
                                
                            
                        
                        
                             Code de vérification
                            
                                
                                    
                                        
                                        
                                    
                                    
                                         (?)
                                    
                                    

                                    
                                
                            
                        

                        
                       
                        
                        

                        
                             
                            Confirmer l&quot; , &quot;'&quot; , &quot;acceptation des conditions générales d’utilisation du service 
                        

                       

                    
                    
                        Les informations sur le paiement vous concernant resteront confidentielles.
                    

                
            
            
            
            
                        
                            
                                Détail de la commande
                            

                            
                            
                                
                                    
                                    
                                        
                                            Identifiant
                                        
                                        
                                            :
                                        
                                        
                                            DE-242480_1691750437274
                                        
                                    
                                    
                                    
                                
                            
                             
                            
                                 
                                    
                                        
                                            Code
                                            Id
                                            Description
                                            Montant
                                        
                                    
									
										 											Direction Générale des Impôts Droits d’enregistrement											468805											Direction Générale des Impôts Droits d’enregistrement											0											MAD 																				 										 											Direction de l’imprimerie officielle frais d’insertion au bulletin officiel											468806											Direction de l’imprimerie officielle frais d’insertion au bulletin officiel											400											MAD 																				 										 											Ministère de la Justice Taxe judiciaire											468807											Ministère de la Justice Taxe judiciaire											350											MAD 																				 										 											Frais de gestion											468808											Frais de gestion											0											MAD 																				 										 											Frais de traitement 											468809											Frais de traitement 											8.25											MAD 																				 
									
                                   
										
                                        
                                            Total
                                           
										   
										  MAD
                                  
                                        
                                        
                                           
										   
                                  
                                        
										                               
                                        
                                            Change
                                            

                                              
59.90 GBP75.07 USD70.52 EUR                                                  @@exchangeamounts@@
                                              
                                              
                                        
                                        
                                        
                                        La valeur en devise est approximative sous réserve des variations des taux de change journaliers
                                        
                                     
                                  
                            
                          




                        
                
                
            
                
                    
                        Détail Marchand
                    
                    
                        
                            
                                
                                    Nom du marchand
                                
                                
                                    :
                                
                                
                                    Direct Entreprise (600000304)
                                
                            
                        

                    
                
            


                    
                        
                            
                                Informations du Client
                            
                            
                                
                                    
                                        
                                            Nom
                                        
                                        
                                            :
                                        
                                        
                                            Hakim
                                        
                                    
                                    
                                        
                                            Adresse
                                        
                                        
                                            :
                                        
                                        
                                            
                                        
                                    
                                    
                                        
                                            Tél
                                        
                                        
                                            :
                                        
                                        
                                            
                                        
                                    
                                    
                                        
                                            E-mail
                                        
                                        
                                            :
                                        
                                        
                                            alt.do-5evyxk6@yopmail.com
                                        
                                    
                                
                            
                        
                    
					
                     
                            
                            
                                
                                    
                                        Valider le paiement
                                    
                                    
                                    
                                    
                                
                            
                        
						
                            
                                
                            
                        
					



            
            
            
                
                    
                        
                            
                                
                                    
                                        
                                    
                                    
                                         Centre Monétique Interbancaire 
                                    
                                
                            

                            
                            
                                
                                
                                
                                
                            
                        

                    
                
            

        



        
    
    
    
    
    
    
    
	
	
	
		if($(&quot; , &quot;'&quot; , &quot;input[value=&quot;MERCHANTSURCHARGE&quot;]&quot; , &quot;'&quot; , &quot;).length == 0 &amp;&amp; $( &quot;input[name$=&quot; , &quot;'&quot; , &quot;MERCHANTSURCHARGE&quot; , &quot;'&quot; , &quot;]&quot; ).val() != &quot;&quot; &amp;&amp; $( &quot;input[name$=&quot; , &quot;'&quot; , &quot;DIMCRITERIA5&quot; , &quot;'&quot; , &quot;]&quot; ).length > 0 &amp;&amp; $( &quot;input[name$=&quot; , &quot;'&quot; , &quot;DIMCRITERIA5&quot; , &quot;'&quot; , &quot;]&quot; ).val() != &quot;&quot; )
		{

			SURCHARGE = $( &quot;input[name$=&quot; , &quot;'&quot; , &quot;MERCHANTSURCHARGE&quot; , &quot;'&quot; , &quot;]&quot; ).val();
			
			
			if($( &quot;input[name$=&quot; , &quot;'&quot; , &quot;DIMCRITERIA5&quot; , &quot;'&quot; , &quot;]&quot; ).val() == &quot;LOC&quot;)
			{
				netamount = 758.25/1.0110;
			}
			
			if($( &quot;input[name$=&quot; , &quot;'&quot; , &quot;DIMCRITERIA5&quot; , &quot;'&quot; , &quot;]&quot; ).val() == &quot;INT&quot;)
			{
				netamount = 758.25/1.0275;
			}
			
			
			netcharge = 758.25 - netamount.toFixed(2);
			
			var diff = Math.abs((parseFloat(netcharge).toFixed(2) - parseFloat(SURCHARGE).toFixed(2)).toFixed(2));
			
			//alert(&quot;ok&quot;);
		
			if(diff > 0.1  || SURCHARGE == 0 || SURCHARGE == &quot;&quot;) 
			{
				alert(&quot;Impossible de procéder au paiement à cause d’une erreur de calcul du montant de votre transaction.\nVous allez être redirigés vers le site pour réessayer.&quot;);
				document.location.href=&quot;&quot;;
			}
			
		}else
		{
			alert(&quot;Impossible de procéder au paiement à cause d’une erreur de calcul du montant de votre transaction.\nVous allez être redirigés vers le site pour réessayer.&quot;);
			document.location.href=&quot;&quot;;
		}
		

		
		
		
		
        amountCur = $( &quot;input[name$=&quot; , &quot;'&quot; , &quot;amountCur&quot; , &quot;'&quot; , &quot;]&quot; );
        symbolCur = $( &quot;input[name$=&quot; , &quot;'&quot; , &quot;symbolCur&quot; , &quot;'&quot; , &quot;]&quot; );
        currenciesList = $( &quot;input[name$=&quot; , &quot;'&quot; , &quot;currenciesList&quot; , &quot;'&quot; , &quot;]&quot; );
        if ( amountCur.length > 0 &amp;&amp;  symbolCur.length > 0 &amp;&amp; amountCur.val() != &quot;&quot; &amp;&amp; symbolCur.val() != &quot;&quot;)
        {

            $(&quot; , &quot;'&quot; , &quot;#amountCurspan&quot; , &quot;'&quot; , &quot;).html(amountCur.val());
            $(&quot; , &quot;'&quot; , &quot;#amountCurspan&quot; , &quot;'&quot; , &quot;).html(amountCur.val());
            $(&quot; , &quot;'&quot; , &quot;#symbolCurspan&quot; , &quot;'&quot; , &quot;).html(symbolCur.val());
            $(&quot; , &quot;'&quot; , &quot;#curdiv&quot; , &quot;'&quot; , &quot;).show();
            
            $(&quot; , &quot;'&quot; , &quot;#amountCurspan2&quot; , &quot;'&quot; , &quot;).html(amountCur.val());
            $(&quot; , &quot;'&quot; , &quot;#symbolCurspan2&quot; , &quot;'&quot; , &quot;).html(symbolCur.val());
            $(&quot; , &quot;'&quot; , &quot;#curdiv2&quot; , &quot;'&quot; , &quot;).show();

        }

        if ( currenciesList.length > 0  &amp;&amp; currenciesList.val().toUpperCase() == &quot;TRUE&quot;)
        {
            $(&quot; , &quot;'&quot; , &quot;#Change&quot; , &quot;'&quot; , &quot;).show();
            $(&quot; , &quot;'&quot; , &quot;#Change2&quot; , &quot;'&quot; , &quot;).show();
        }

        if ( (amountCur.length > 0 &amp;&amp;  symbolCur.length > 0 &amp;&amp; amountCur.val() != &quot;&quot; &amp;&amp; symbolCur.val() != &quot;&quot;) || (currenciesList.length > 0 &amp;&amp; currenciesList.val().toUpperCase() == &quot;TRUE&quot; ))
        {
            $(&quot; , &quot;'&quot; , &quot;#Changemessage&quot; , &quot;'&quot; , &quot;).show();
            $(&quot; , &quot;'&quot; , &quot;#Changemessage2&quot; , &quot;'&quot; , &quot;).show();
        }

        
    function isChecked(checkedBox){

        var checkedValue=parseFloat(checkedBox.value);
        var amount=parseFloat(document.getElementById(&quot; , &quot;'&quot; , &quot;amount&quot; , &quot;'&quot; , &quot;).value);
        var totalAmount=0;
        if (document.getElementById(checkedBox.id).checked)  {
            totalAmount= parseFloat(Number(amount+checkedValue)).toFixed(2);
        }else {
            totalAmount= parseFloat(Number(amount-checkedValue)).toFixed(2);
        }


        document.getElementById(&quot;amount&quot;).value=totalAmount;
    }
    $(document).ready(function(){
        if(!isNaN(document.getElementById(&quot;installment-wrapper&quot;).getAttribute(&quot;data-installment&quot;)) ){
            document.getElementById(&quot;installment-wrapper&quot;).style.display=&quot; , &quot;'&quot; , &quot;block&quot; , &quot;'&quot; , &quot;;
            document.getElementById(&quot;installment-param-wrapper&quot;).style.display=&quot; , &quot;'&quot; , &quot;block&quot; , &quot;'&quot; , &quot;;
            document.getElementById(&quot;installment-select-wrapper&quot;).innerHTML=&quot;&quot;;
            document.getElementById(&quot;installment-select-wrapper&quot;).style.display=&quot; , &quot;'&quot; , &quot;none&quot; , &quot;'&quot; , &quot;;

        }
    });



    

    
    



id(&quot;pan&quot;)&quot;) or . = concat(&quot;



    
    
        
            
                
                    
                        
                        Demande de paiement
                    
                

                
                    
                        
                            
                               
                            
                        
                    
                
                
                    if( window.location.href.substring(window.location.href.indexOf(&quot; , &quot;'&quot; , &quot;#&quot; , &quot;'&quot; , &quot;)) == &quot;#ProcReturnCode=&amp;ErrMsg=&quot;)
                    {
                        document.getElementById(&quot;b-alert&quot;).innerHTML =  &quot;Impossible de procéder au paiement&quot;;
                        document.getElementById(&quot;div-row&quot;).style.display = &quot;block&quot;;
                    }else
                    if(getParameterByName(&quot; , &quot;'&quot; , &quot;ErrMsg&quot; , &quot;'&quot; , &quot;) &amp;&amp; getParameterByName(&quot; , &quot;'&quot; , &quot;ProcReturnCode&quot; , &quot;'&quot; , &quot;))
                    {
                        document.getElementById(&quot;b-alert&quot;).innerHTML =  atob(getParameterByName(&quot; , &quot;'&quot; , &quot;ErrMsg&quot; , &quot;'&quot; , &quot;)) + &quot; , &quot;'&quot; , &quot; (&quot; , &quot;'&quot; , &quot; + getParameterByName(&quot; , &quot;'&quot; , &quot;ProcReturnCode&quot; , &quot;'&quot; , &quot;) + &quot; , &quot;'&quot; , &quot;)&quot; , &quot;'&quot; , &quot;;
                        document.getElementById(&quot;div-row&quot;).style.display = &quot;block&quot;;
                    }
                

                




                    
                                            
                                            
                                                Détail de Paiement vendredi, août 11, 2023 11:43:40
                                            
                                            

                                                
                                                
                                                    
                                                        
                                                             Modes de paiement : 
                                        
                                        
                                            
                                        
                                    
                            
                        















































                        
                            
                                 
                        

                        
						
						
						
													
							$(&quot; , &quot;'&quot; , &quot;input:radio[name=&quot;paymentType&quot;]&quot; , &quot;'&quot; , &quot;).change(
								function(){
									if ($(this).is(&quot; , &quot;'&quot; , &quot;:checked&quot; , &quot;'&quot; , &quot;) &amp;&amp; $(this).val() == &quot; , &quot;'&quot; , &quot;UPOP&quot; , &quot;'&quot; , &quot;) {
										$(&quot; , &quot;'&quot; , &quot;#zoncardHolderName&quot; , &quot;'&quot; , &quot;).hide();
										$(&quot; , &quot;'&quot; , &quot;#zonCard_ExpDate&quot; , &quot;'&quot; , &quot;).hide();
										$(&quot; , &quot;'&quot; , &quot;#zonecvv&quot; , &quot;'&quot; , &quot;).hide();
										$(&quot;input[name=&quot; , &quot;'&quot; , &quot;cardHolderName&quot; , &quot;'&quot; , &quot;]&quot;).removeAttr(&quot; , &quot;'&quot; , &quot;required&quot; , &quot;'&quot; , &quot;);
										$(&quot;input[name=&quot; , &quot;'&quot; , &quot;cv2&quot; , &quot;'&quot; , &quot;]&quot;).removeAttr(&quot; , &quot;'&quot; , &quot;required&quot; , &quot;'&quot; , &quot;);
									}else
									{
										$(&quot; , &quot;'&quot; , &quot;#zoncardHolderName&quot; , &quot;'&quot; , &quot;).show();
										$(&quot; , &quot;'&quot; , &quot;#zonCard_ExpDate&quot; , &quot;'&quot; , &quot;).show();
										$(&quot; , &quot;'&quot; , &quot;#zonecvv&quot; , &quot;'&quot; , &quot;).show();
										$(&quot;input[name=&quot; , &quot;'&quot; , &quot;cardHolderName&quot; , &quot;'&quot; , &quot;]&quot;).prop(&quot; , &quot;'&quot; , &quot;required&quot; , &quot;'&quot; , &quot;,true);
										$(&quot;input[name=&quot; , &quot;'&quot; , &quot;cv2&quot; , &quot;'&quot; , &quot;]&quot;).prop(&quot; , &quot;'&quot; , &quot;required&quot; , &quot;'&quot; , &quot;,true);
									}
								});
						


                        
                             Nom du porteur de la carte
                            
                        
                        
                             Numéro de carte de paiement
                            
                        

                        
                             Date d&quot; , &quot;'&quot; , &quot;expiration
                            
                                
                                    
                                        
                                            01
                                            02
                                            03
                                            04
                                            05
                                            06
                                            07
                                            08
                                            09
                                            10
                                            11
                                            12
                                        
                                    
                                    

                                    
                                    
                                        
20232024202520262027202820292030203120322033203420352036203720382039204020412042                                            @@years@@
                                        
                                    
                                    

                                    
                                
                            
                        
                        
                             Code de vérification
                            
                                
                                    
                                        
                                        
                                    
                                    
                                         (?)
                                    
                                    

                                    
                                
                            
                        

                        
                       
                        
                        

                        
                             
                            Confirmer l&quot; , &quot;'&quot; , &quot;acceptation des conditions générales d’utilisation du service 
                        

                       

                    
                    
                        Les informations sur le paiement vous concernant resteront confidentielles.
                    

                
            
            
            
            
                        
                            
                                Détail de la commande
                            

                            
                            
                                
                                    
                                    
                                        
                                            Identifiant
                                        
                                        
                                            :
                                        
                                        
                                            DE-242480_1691750437274
                                        
                                    
                                    
                                    
                                
                            
                             
                            
                                 
                                    
                                        
                                            Code
                                            Id
                                            Description
                                            Montant
                                        
                                    
									
										 											Direction Générale des Impôts Droits d’enregistrement											468805											Direction Générale des Impôts Droits d’enregistrement											0											MAD 																				 										 											Direction de l’imprimerie officielle frais d’insertion au bulletin officiel											468806											Direction de l’imprimerie officielle frais d’insertion au bulletin officiel											400											MAD 																				 										 											Ministère de la Justice Taxe judiciaire											468807											Ministère de la Justice Taxe judiciaire											350											MAD 																				 										 											Frais de gestion											468808											Frais de gestion											0											MAD 																				 										 											Frais de traitement 											468809											Frais de traitement 											8.25											MAD 																				 
									
                                   
										
                                        
                                            Total
                                           
										   
										  MAD
                                  
                                        
                                        
                                           
										   
                                  
                                        
										                               
                                        
                                            Change
                                            

                                              
59.90 GBP75.07 USD70.52 EUR                                                  @@exchangeamounts@@
                                              
                                              
                                        
                                        
                                        
                                        La valeur en devise est approximative sous réserve des variations des taux de change journaliers
                                        
                                     
                                  
                            
                          




                        
                
                
            
                
                    
                        Détail Marchand
                    
                    
                        
                            
                                
                                    Nom du marchand
                                
                                
                                    :
                                
                                
                                    Direct Entreprise (600000304)
                                
                            
                        

                    
                
            


                    
                        
                            
                                Informations du Client
                            
                            
                                
                                    
                                        
                                            Nom
                                        
                                        
                                            :
                                        
                                        
                                            Hakim
                                        
                                    
                                    
                                        
                                            Adresse
                                        
                                        
                                            :
                                        
                                        
                                            
                                        
                                    
                                    
                                        
                                            Tél
                                        
                                        
                                            :
                                        
                                        
                                            
                                        
                                    
                                    
                                        
                                            E-mail
                                        
                                        
                                            :
                                        
                                        
                                            alt.do-5evyxk6@yopmail.com
                                        
                                    
                                
                            
                        
                    
					
                     
                            
                            
                                
                                    
                                        Valider le paiement
                                    
                                    
                                    
                                    
                                
                            
                        
						
                            
                                
                            
                        
					



            
            
            
                
                    
                        
                            
                                
                                    
                                        
                                    
                                    
                                         Centre Monétique Interbancaire 
                                    
                                
                            

                            
                            
                                
                                
                                
                                
                            
                        

                    
                
            

        



        
    
    
    
    
    
    
    
	
	
	
		if($(&quot; , &quot;'&quot; , &quot;input[value=&quot;MERCHANTSURCHARGE&quot;]&quot; , &quot;'&quot; , &quot;).length == 0 &amp;&amp; $( &quot;input[name$=&quot; , &quot;'&quot; , &quot;MERCHANTSURCHARGE&quot; , &quot;'&quot; , &quot;]&quot; ).val() != &quot;&quot; &amp;&amp; $( &quot;input[name$=&quot; , &quot;'&quot; , &quot;DIMCRITERIA5&quot; , &quot;'&quot; , &quot;]&quot; ).length > 0 &amp;&amp; $( &quot;input[name$=&quot; , &quot;'&quot; , &quot;DIMCRITERIA5&quot; , &quot;'&quot; , &quot;]&quot; ).val() != &quot;&quot; )
		{

			SURCHARGE = $( &quot;input[name$=&quot; , &quot;'&quot; , &quot;MERCHANTSURCHARGE&quot; , &quot;'&quot; , &quot;]&quot; ).val();
			
			
			if($( &quot;input[name$=&quot; , &quot;'&quot; , &quot;DIMCRITERIA5&quot; , &quot;'&quot; , &quot;]&quot; ).val() == &quot;LOC&quot;)
			{
				netamount = 758.25/1.0110;
			}
			
			if($( &quot;input[name$=&quot; , &quot;'&quot; , &quot;DIMCRITERIA5&quot; , &quot;'&quot; , &quot;]&quot; ).val() == &quot;INT&quot;)
			{
				netamount = 758.25/1.0275;
			}
			
			
			netcharge = 758.25 - netamount.toFixed(2);
			
			var diff = Math.abs((parseFloat(netcharge).toFixed(2) - parseFloat(SURCHARGE).toFixed(2)).toFixed(2));
			
			//alert(&quot;ok&quot;);
		
			if(diff > 0.1  || SURCHARGE == 0 || SURCHARGE == &quot;&quot;) 
			{
				alert(&quot;Impossible de procéder au paiement à cause d’une erreur de calcul du montant de votre transaction.\nVous allez être redirigés vers le site pour réessayer.&quot;);
				document.location.href=&quot;&quot;;
			}
			
		}else
		{
			alert(&quot;Impossible de procéder au paiement à cause d’une erreur de calcul du montant de votre transaction.\nVous allez être redirigés vers le site pour réessayer.&quot;);
			document.location.href=&quot;&quot;;
		}
		

		
		
		
		
        amountCur = $( &quot;input[name$=&quot; , &quot;'&quot; , &quot;amountCur&quot; , &quot;'&quot; , &quot;]&quot; );
        symbolCur = $( &quot;input[name$=&quot; , &quot;'&quot; , &quot;symbolCur&quot; , &quot;'&quot; , &quot;]&quot; );
        currenciesList = $( &quot;input[name$=&quot; , &quot;'&quot; , &quot;currenciesList&quot; , &quot;'&quot; , &quot;]&quot; );
        if ( amountCur.length > 0 &amp;&amp;  symbolCur.length > 0 &amp;&amp; amountCur.val() != &quot;&quot; &amp;&amp; symbolCur.val() != &quot;&quot;)
        {

            $(&quot; , &quot;'&quot; , &quot;#amountCurspan&quot; , &quot;'&quot; , &quot;).html(amountCur.val());
            $(&quot; , &quot;'&quot; , &quot;#amountCurspan&quot; , &quot;'&quot; , &quot;).html(amountCur.val());
            $(&quot; , &quot;'&quot; , &quot;#symbolCurspan&quot; , &quot;'&quot; , &quot;).html(symbolCur.val());
            $(&quot; , &quot;'&quot; , &quot;#curdiv&quot; , &quot;'&quot; , &quot;).show();
            
            $(&quot; , &quot;'&quot; , &quot;#amountCurspan2&quot; , &quot;'&quot; , &quot;).html(amountCur.val());
            $(&quot; , &quot;'&quot; , &quot;#symbolCurspan2&quot; , &quot;'&quot; , &quot;).html(symbolCur.val());
            $(&quot; , &quot;'&quot; , &quot;#curdiv2&quot; , &quot;'&quot; , &quot;).show();

        }

        if ( currenciesList.length > 0  &amp;&amp; currenciesList.val().toUpperCase() == &quot;TRUE&quot;)
        {
            $(&quot; , &quot;'&quot; , &quot;#Change&quot; , &quot;'&quot; , &quot;).show();
            $(&quot; , &quot;'&quot; , &quot;#Change2&quot; , &quot;'&quot; , &quot;).show();
        }

        if ( (amountCur.length > 0 &amp;&amp;  symbolCur.length > 0 &amp;&amp; amountCur.val() != &quot;&quot; &amp;&amp; symbolCur.val() != &quot;&quot;) || (currenciesList.length > 0 &amp;&amp; currenciesList.val().toUpperCase() == &quot;TRUE&quot; ))
        {
            $(&quot; , &quot;'&quot; , &quot;#Changemessage&quot; , &quot;'&quot; , &quot;).show();
            $(&quot; , &quot;'&quot; , &quot;#Changemessage2&quot; , &quot;'&quot; , &quot;).show();
        }

        
    function isChecked(checkedBox){

        var checkedValue=parseFloat(checkedBox.value);
        var amount=parseFloat(document.getElementById(&quot; , &quot;'&quot; , &quot;amount&quot; , &quot;'&quot; , &quot;).value);
        var totalAmount=0;
        if (document.getElementById(checkedBox.id).checked)  {
            totalAmount= parseFloat(Number(amount+checkedValue)).toFixed(2);
        }else {
            totalAmount= parseFloat(Number(amount-checkedValue)).toFixed(2);
        }


        document.getElementById(&quot;amount&quot;).value=totalAmount;
    }
    $(document).ready(function(){
        if(!isNaN(document.getElementById(&quot;installment-wrapper&quot;).getAttribute(&quot;data-installment&quot;)) ){
            document.getElementById(&quot;installment-wrapper&quot;).style.display=&quot; , &quot;'&quot; , &quot;block&quot; , &quot;'&quot; , &quot;;
            document.getElementById(&quot;installment-param-wrapper&quot;).style.display=&quot; , &quot;'&quot; , &quot;block&quot; , &quot;'&quot; , &quot;;
            document.getElementById(&quot;installment-select-wrapper&quot;).innerHTML=&quot;&quot;;
            document.getElementById(&quot;installment-select-wrapper&quot;).style.display=&quot; , &quot;'&quot; , &quot;none&quot; , &quot;'&quot; , &quot;;

        }
    });



    

    
    



id(&quot;pan&quot;)&quot;))]</value>
      <webElementGuid>f3e6fa0c-eabd-4daf-9a49-145e5fb623b1</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
